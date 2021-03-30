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
	String searchname = request.getParameter("sname");
	String letter = request.getParameter("first");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_db","root","root");
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select *from student where name LIKE '"+letter+"%' ");
	while(rs.next())
	{
		int i = rs.getInt("rollno");
		String name = rs.getString("name"); %> <br>
		<% out.println(i); %> 
		<% out.println(name); %> <br>
	<% }
	%>
</body>
</html>