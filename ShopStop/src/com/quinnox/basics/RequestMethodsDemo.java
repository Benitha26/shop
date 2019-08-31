package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestMethodsDemo
 */
@WebServlet("/RequestMethodsDemo")
public class RequestMethodsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestMethodsDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Servlet HelloWorld</title>");
	      out.println("</head>");
	      out.println("<body bgcolor=\"#ffffff\">");
	      out.println("<h1>Request methods of ServletRequest Interface</h1>");
	      out.println("<h1>Servlet ServletServlet at :" +request.getContextPath()+ "</h1>"); 
	      out.println("<h1>Servlet ServletServlet Requested URI :" +request.getRequestURI() + "</h1>"); 
	      out.println("<h1>Servlet ServletServlet Protocol :" +request.getProtocol()+ "</h1>"); 
	      out.println("<b>Server Name: </b>"+request.getServerName()+"<br/>");
	      out.println("<b>Server Port Number: </b>"+request.getServerPort()+"<br/>");
	      out.println("<h3>Random Value for each Request: " +Math.random()+ "</h3>"); 
	      out.println("</body>");
	      out.println("</html>");
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
