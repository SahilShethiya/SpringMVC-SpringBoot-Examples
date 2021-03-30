<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	<c:forEach items="${sessionScope.ls}" var="i">
	<c:out value="${i.id}"></c:out>
	<c:out value="${i.fn}"></c:out>
	
	<c:out value="${i.ln} "></c:out>  
	<a href="myservlet2?id=${i.id}">Delete</a>			
	</c:forEach>
</body>
</html>