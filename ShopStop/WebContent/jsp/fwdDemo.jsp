<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP forward example with parameters</title>
</head>
<body>
	<jsp:forward page="display.jsp">
	<jsp:param value="Benny" name="name"/>
	<jsp:param value="Quinnox" name="company"/>
	<jsp:param value="jsp forward action" name="technology"/>
	<jsp:param value="fwdDemo.jsp" name="reqform"/>
	</jsp:forward>

</body>
</html> 