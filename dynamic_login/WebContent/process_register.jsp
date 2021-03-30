<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>

<%
	String username = request.getParameter("u_name");
	String firstname = request.getParameter("f_name");	
	String lastname = request.getParameter("l_name");
	String password = request.getParameter("pass");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
	Statement s = con.createStatement();
	int rs = s.executeUpdate("insert into userdata(username,pass,firstname,lastname) values('"+username+"','"+password+"','"+firstname+"','"+lastname+"') ");
	if(rs==1)
	{
		out.println("Registered Successfully");
		response.sendRedirect("login.jsp");
	}
	else
	{
		out.println("Operation failed");
	}
%>
</body>
</html>