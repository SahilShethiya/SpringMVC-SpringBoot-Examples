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
	String fname = (String)request.getParameter("fname");
	String lname = (String)request.getParameter("lname");
	String address1 = (String)request.getParameter("add1p");
	String address2 = (String)request.getParameter("add2p");
	String address3 = (String)request.getParameter("add1r");
	String address4 = (String)request.getParameter("add2r");
	
	out.println(fname);
	out.println(lname);
	out.println(address1);
	out.println(address2);
	out.println(address3);
	out.println(address4);
%>
</body>
</html>