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
	String new1 = request.getParameter("new_id");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dynamic_deletedb","root","root");
	Statement s = con.createStatement();
	int rs = s.executeUpdate("delete from data1 where id='"+new1+"' ");
	if(rs==1)
	{
			response.sendRedirect("data.jsp");
	}
%>

</body>
</html>