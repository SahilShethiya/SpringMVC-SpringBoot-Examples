<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String fn = request.getParameter("fn");
	String ln = request.getParameter("ln");
	String un = request.getParameter("un");
	String pass = request.getParameter("pass");
	
	out.println("FirstName : "+fn); %> <br>
	<% out.println("LastName : "+ln); %>	<br>
	<% out.println("Username : "+un); %>	<br>
	<% out.println("Password : "+pass);
	%>
	
	
</body>
</html>