<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h6>Enter FirstName and LastName To Search</h6><br>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<form:form action="dataInsert.html" method="get" modelAttribute="data">
	
	FirstName : <form:input path="firstname"/>
	<br>
	LastName : <form:input path="lastname"/>
	<input type="submit">
	</form:form>
</body>
</html>