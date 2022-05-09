package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    PrintWriter out=response.getWriter();
	    response.setContentType("text/html");
	    String un=request.getParameter("uname");
	    String up=request.getParameter("pwd");
	    RequestDispatcher rd;
	    if(un.equalsIgnoreCase("admin")&&up.equals("admin123"))
	    {
	    	//out.println("login successfully");
	    	rd=request.getRequestDispatcher("ValidServlet");
	    	rd.forward(request, response);
	    }
	    else
	    {
	    	rd=request.getRequestDispatcher("login.html");
	    	rd.include(request, response);
	    	out.println("invalid user name and password");
	    }
	
	}

}
