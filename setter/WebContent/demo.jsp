<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="ab.*"  %>
<%
abc a1 = new abc();
a1.setLn("abc");
a1.setFn("xyz");
String d1 = a1.getLn();
String d2 = a1.getFn();


out.println(d1);
out.println(d2);
%>


<jsp:useBean id="a" class="ab.abc"></jsp:useBean>
<jsp:setProperty property="fn" name="a" value="abc"/>
<jsp:setProperty property="ln" name="a" value="xyz"/>

<jsp:getProperty property="fn" name="a"/>
<jsp:getProperty property="ln" name="a"/>
</body>
</html>