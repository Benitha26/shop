<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
<h2>Hello thi is a display.jsp</h2>
My name is:<%=request.getParameter("name") %><br>
Web site is:<%=request.getParameter("company") %><br>
Topic is:<%=request.getParameter("technology") %><br>
Forward request came from the page:<%=request.getParameter("reqform") %><br>
</body>
</html>