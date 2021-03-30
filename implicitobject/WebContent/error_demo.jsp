<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page errorPage="error.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="str" value="how are you" />
Length of string :  ${s:length(str)}<br>
String after replace : ${s:replace(str,"how","who")} <br> 
Uppercase : ${s:toUpperCase(str)}<br>
Lowercase : ${s:toLowerCase(str)}<br>
<c:set var="oldpass" value="Hellopass"></c:set>
<c:set var="newpass" value="Hellopassnew"></c:set>
<c:if test="${s:contains(newpass,oldpass) }">
	<c:out value="New pass should not contain old pass"></c:out>
</c:if>
</body>
</html>