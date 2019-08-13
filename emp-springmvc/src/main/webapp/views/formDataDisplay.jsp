<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	int userid = (Integer) (request.getAttribute("userId"));
	String password = (String) request.getAttribute("password");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FORM</title>
</head>
<body>
USER ID = <%=userid %>
<br>
PASSWORD = <%=password %>
</body>
</html>