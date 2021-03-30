<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="second.jsp" %>
	<%@page import="java.util.Date"%>
	<%-- <% out.println("Hello"); %><br> --%>
	<%! Date obj = new Date(); %>
	Date is : <%= obj %><br>
	<%! int hrs= obj.getHours(); %>
	<h2><%
	
		if(hrs<12)
			out.println("Good morning");
		else if(hrs>12 && hrs<16)
			out.println("Good Afternoon");
		else if(hrs>16)
			out.println("Good Evening");
	
	%></h2>
</body>
</html>