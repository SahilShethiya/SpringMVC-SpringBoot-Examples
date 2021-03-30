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
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
	String name = (String)session.getAttribute("uname");
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select *from userdata where username='"+name+"' ");
	String fname="",lname="";
	while(rs.next())
	{
		fname = rs.getString("firstname");
		lname = rs.getString("lastname");
	}%>
	<h1>
	<% out.println("Hello " +fname+" "+lname ); %>
	</h1>
	<br>
	<a href="change.jsp">Click here to change password</a>
</body>
</html>