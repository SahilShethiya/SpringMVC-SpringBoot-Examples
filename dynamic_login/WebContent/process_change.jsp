<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<%
String new_pass = request.getParameter("new_pass");
String old_pass = request.getParameter("old_pass");
String new_name = (String)session.getAttribute("uname");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
Statement s = con.createStatement();
int rs = s.executeUpdate("update userdata set pass='"+new_pass+"' where username='"+new_name+"' AND pass='"+old_pass+"' ");
if(rs==1)
{
	out.println("Your password is updated");
}
else
{
	out.println("Operation failed");
	response.sendRedirect("change.jsp");
}

%>
</body>
</html>