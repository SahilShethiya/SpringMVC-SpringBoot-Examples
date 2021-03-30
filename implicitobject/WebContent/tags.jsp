<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="no1" value="50" />
	<c:set var="no2" value="30" />
	<c:set var="no3" value="40" />
	<c:choose>
		<c:when test="${no1<no2 }">
			${"No1 is smaller than no2"}
		</c:when>
		<c:when test="${no1<no3 }">
			${"No1 is smaller than no2"}
		</c:when>
		<c:otherwise>
			${"No1 is greater than no2 & no3"}
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="1" end="5">
		<c:out value="${i }"/>
	</c:forEach>
	
	<c:forTokens var="de" items="a,b,c,d" delims=",">
		<c:out value="${de }" />
	</c:forTokens>
	</body>
</html>