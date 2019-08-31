package com.quinnox.basics.controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quinnox.basics.dao.CustomerDAO;
import com.quinnox.basics.model.Customer;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("userName");
		String password=request.getParameter("userPassword");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		Customer c=new Customer();
		c.setName(name);
		c.setPassword(password);
		c.setEmail(email);
		c.setCountry(country);
		
		int status=CustomerDAO.insertCustomer(c);
		if(status>0)
		{
			pw.print("<p>Record Saved Succesfully</p>");
			request.getRequestDispatcher("NewCutomer.html").include(request, response);
		}
		else
		{
			pw.print("<p>Sorry!!! Unable to save record</p>");
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
