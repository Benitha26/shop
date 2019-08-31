package com.quinnox.basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quinnox.basics.dao.CustomerDAO;
import com.quinnox.basics.model.Customer;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        long id=Long.parseLong(sid);  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        String email=request.getParameter("email");  
        String country=request.getParameter("country");  
          
        Customer e=new Customer();  
        e.setId(id);  
        e.setName(name);  
        e.setPassword(password);  
        e.setEmail(email);  
        e.setCountry(country);  
          
        int status=CustomerDAO.updateCustomer(e);
        if(status>0){  
            response.sendRedirect("ViewCustomers.jsp");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
