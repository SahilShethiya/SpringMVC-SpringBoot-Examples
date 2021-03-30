<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page isErrorPage="true" %>
<body>
	<%
		try{
		int a = 0;
		int b = 10;
		int c = b/a;
		}
		catch(Exception e)
		{
			out.println("Sorry following Error occured : "+e);
		}
	%>
	
</body>
</html>