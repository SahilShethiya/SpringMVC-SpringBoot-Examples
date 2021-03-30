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
<table cellpadding="2" cellspacing="2" border="1px solid black" >
		<tr>
			<th> ID </th>
			<th> First Name </th>
			<th> Last name </th>
			<th> Action </th>
		</tr>
</table>
<%
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dynamic_deletedb","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select *from data1");
			while(rs.next())
			{
				String d_id = rs.getString("id");
				String f_name = rs.getString("f_name");
				String l_name = rs.getString("l_name");
				%> <table cellpadding="2" cellspacing="2" border="1px solid black">
					<tr>
					
						<td> <% out.println(d_id); %> </td>
						<td> <% out.println(f_name); %> </td>
						<td> <% out.println(l_name); %> </td>
						<td> <a href="edit.jsp?new_id=<%=d_id%>"><input type="submit" name ="del" value="edit"></a> 
						</td>
					</tr>
				   </table>
		<% 	}
%>
</body>
</html>