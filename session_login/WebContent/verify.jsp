
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
	String log_name = request.getParameter("log_uname");
	String log_pass	= request.getParameter("log_pass");
	
	String uname = (String)session.getAttribute("uname");
	String pass = (String)session.getAttribute("pass");
	
	if(log_name.equals(uname) && log_pass.equals(pass))
	{
		response.sendRedirect("home.jsp");
	}
	else
		response.sendRedirect("login.jsp");
		
%>
</body>
</html>