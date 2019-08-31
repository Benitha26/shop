<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using java Bean in jsp</title>
<jsp:useBean id="BeanId" class="com.quinnox.basics.model.SimpleBean" scope="application"/>
<jsp:setProperty property="name" name="BeanId" value="Andrew"/>
<jsp:setProperty property="age" name="BeanId" value="25"/>
</head>
<body>
Name is:<jsp:getProperty property="name" name="BeanId"/><br/>
Age is:<jsp:getProperty property="age" name="BeanId"/>
</body>
</html>