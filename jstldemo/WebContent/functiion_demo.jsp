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
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="i" value="Sahil"></c:set>
<c:set var="x" value="${s:length(i)}"> </c:set>
<c:out value="${x}"></c:out> 

<c:set value="${s:replace(i,'hil','mil')}" var="q"></c:set>
${q}
</body>
</html>