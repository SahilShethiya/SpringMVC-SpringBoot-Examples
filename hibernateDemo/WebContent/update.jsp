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
<c:forEach items="${sessionScope.ls}" var="i" >

<form action="singal" method="post">
	<input type="hidden" name="f1" value="edit">
	<input type="hidden" name="pp" value="${i.id}">
    <br>
	firstname :
    <input type="text" name="fn" value="${i.fn}">
    <br>
    lastname :
    <input type="text" name="ln" value="${i.ln}">
    <br>
    <br>
     <input type="submit" name="submit" value="Submit">
     <input type="reset" name="reset" value="Reset">
</form> 
</c:forEach>

</body>
</html>