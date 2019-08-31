package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		//PrintWriter pw=response.getWriter();
		response.sendRedirect("http://www.quinnox.com");
		//pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		//pw.print(pass);
		if(user.equals("raj")&& pass.equals("redhat"))
		{
			//pw.println("Welcome"+user+"<br><br>");
			//pw.println("Login Succesful....");
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			rd.forward(request,response);
		}
			else
			{
				pw.println("<html><body text='red'><h3>Login failed...!</h3></body></html>");
				//pw.println("login failed....");
				//pw.close();
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request,response);
			}
		
		// TODO Auto-generated method stub
	}

}
