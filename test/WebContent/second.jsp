<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s = (String)request.getAttribute("abc");
	int f = (int)session.getAttribute("pqr");
	float i = (float)session.getAttribute("xyz");
	out.println("String : "+s);
	out.println("Int : "+f);
	out.println("Session :"+i);
	
%>
<a href="third.jsp">Third</a>
</body>
</html>