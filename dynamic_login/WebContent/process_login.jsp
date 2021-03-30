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
	String log_un = request.getParameter("login_un");
	String log_pass = (String)request.getParameter("login_pass");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
	Statement s = con.createStatement();
	ResultSet rs = s.executeQuery("select *from userdata where username='"+log_un+"' AND pass='"+log_pass+"' ");
	String s1="",s2="";
	while(rs.next())
	{
		s1 = rs.getString("username");
		s2 = rs.getString("pass");
	}
	if(s1.equals(log_un) && s2.equals(log_pass))
	{
		session.setAttribute("uname", s1);
		response.sendRedirect("welcome.jsp");
	}
	else
	{
		out.println("Invalid username or password");
	}
%>
</body>
</html>