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
	String s1 = request.getParameter("ed_fname");
	String s2 = request.getParameter("ed_lname");
	String new_id = request.getParameter("ed_id");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dynamic_deletedb","root","root");
	Statement s = con.createStatement();
	int rs = s.executeUpdate("UPDATE data1 SET f_name='"+s1+"',l_name='"+s2+"' where id='"+new_id+"' ");
	if(rs==1)
	{
		out.println("Data updated");
		response.sendRedirect("data.jsp");
	}
	else
	{
		out.println("Operation failed");	
	}
%>
</body>
</html>