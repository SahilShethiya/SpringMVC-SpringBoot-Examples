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
	ResultSet rs = s.executeQuery("select *from data1 where id= '"+new1+"' ");
	String demo_fname=null, demo_lname=null;
	while(rs.next())
	{
		demo_fname = rs.getString("f_name");
		demo_lname = rs.getString("l_name");
	}
%>
<form action="edit_second.jsp" method="get">
ID : <input type="hidden" name="ed_id" value=<%=new1 %> >
First Name : <input type="text" name="ed_fname" value=<%=demo_fname%>><br>
Last Name : <input type="text" name="ed_lname" value=<%=demo_lname %>><br>
<input type="submit" name="edit" value="edit">
</form>
</body>
</html>