<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<c:set var="i" value="10" />
<c:if test="${i eq 10}">
<h1>Hello</h1>
</c:if>
<c:set var="x" value="10" scope="session"></c:set>
<c:redirect url="demopage.jsp"></c:redirect>
</body>
</html>