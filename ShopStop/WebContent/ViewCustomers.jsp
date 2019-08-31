<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.* , com.quinnox.basics.dao.*, com.quinnox.basics.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/Newcss1.css"/>
</head>
<body>
<nav>
  <ul>
    <li>
        <a href="#">Home</a>
    </li>
    <li>
        <a href="#">Products</a>
    </li>
    <li>
        <a href="#">Payment</a>
    </li>
    <li>
        <a href="#">Contact Us</a>
    </li>
    <li>
        <a href="LogoutServlet">Logout</a>
    </li>
  </ul>
</nav>

<%
if(session!= null){
	if(session.getAttribute("user")!=null){
		String name=(String) session.getAttribute("user");
	
	
%>
<div style="background-color:red; color:white; padding:5px; 
	font-size:75%; font-family:verdana; text-align:center; width:50%;
	margin-left:200px;">
	Welcome<%=name.toUpperCase() %>
	</div>
	<%
		int timeout=20;
	session.setMaxInactiveInterval(timeout);
	response.setHeader("Refresh",timeout + "; URL=timeout.jsp");
	}
}
else
{
	response.sendRedirect("LogoutServlet");
}
	%>
	<h1>Customers List</h1>
	<div align="center"><img alt="image" src="images/image3.gif" width="10%" height="10%"></div>
	<% List<Customer> list=CustomerDAO.getAllEmployees(); %>
	<div class="test">
	<table border=1>
	<tr>
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Password</th>
		<th>Email</th>
		<th>Country</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<% for(Customer i:list){ %>
	<tr>
		<td><%=i.getId() %></td>
		<td><%=i.getName() %></td>
		<td><%=i.getPassword() %></td>
		<td><%=i.getEmail() %></td>
		<td><%=i.getCountry() %></td>
		<td><a href='EditCustomer.jsp?id=<%=i.getId() %>'>Edit</a></td>
		<td><a href='DeleteServlet?id=<%=i.getId() %>'>Delete</a></td>
	</tr>
	<% } %>
	</table>
	</div>
</body>


</html>