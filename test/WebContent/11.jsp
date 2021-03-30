<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><% 
	for(int i=0;i<10;i++)
	{
		%><div style="width:100px; height:50px; border: 1px solid black;">
		<%
		if(i%2==0)
		{
			%>
			<div style="width:100px; height:50px; background-color: red;"><% out.println("0"); %></div><%
		}
		else
		{
			%>
			<div style="width:100px; height:50px; background-color: yellow;"><% out.println("1"); %></div>
		<%} %>
		</div>
	<% }
	%>
</body>
</html>