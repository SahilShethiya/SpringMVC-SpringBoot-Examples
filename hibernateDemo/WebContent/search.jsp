<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegController" method="post">
	<input type="hidden" name="f" value="search">
	firstname :
    <input type="text" name="fn" value="">
    <br>
    lastname :
    <input type="text" name="ln" value="">
    <br>

	<input type="submit" name="submit" value="Submit">
	</form>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<c:forEach items="${sessionScope.ls}" var="i" >
${i.id}
${i.firstname}
${i.lastname}
<a href="RegController?id=${i.id}&f=v1"><input type="button" name="delet" value="delet"></a>  
<a href="update.jsp?ff=${i.id}&f=v2"><input type="button" name="edit" value="edit"></a> 
</c:forEach>	
</body>
</html>