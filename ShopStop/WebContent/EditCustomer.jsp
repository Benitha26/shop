<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.quinnox.basics.dao.* ,com.quinnox.basics.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
String id=request.getParameter("id");  
Customer c=CustomerDAO.getCustomerById(Long.parseLong(id));  
%>  

<h1>Edit Customer City</h1>  

<form action="EditServlet" method="post">  
<input type="hidden" name="id" value="<%=c.getId() %>"/>  
<table>  
<tr><td>Name:</td><td>
<input type="text" name="name" value="<%=c.getName()%>"/></td></tr>  
<tr><td>Password:</td>
<td><input type="password" name="password" value=" "/></td></tr>  
<tr><td>Email:</td>
<td><input type="email" name="email" value="<%=c.getEmail() %>"/></td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:150px">  
<option>India</option>  
<option>USA</option>  
<option>UK</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Update Customer"/></td></tr>  

</table>  

</form>
</body>
</html>