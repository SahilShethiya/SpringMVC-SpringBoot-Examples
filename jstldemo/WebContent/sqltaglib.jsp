<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="s" uri="http://java.sun.com/jstl/sql_rt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<s:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/demo_db" user="root" password="root" var="i"/>
<%-- <s:update dataSource="${i}">update student set name="chahil" where rollno="1"</s:update> --%>
<s:query var="x" dataSource="${i}" scope="session">select *from student</s:query>
<c:forEach items="${x.rows}" var="p">
${p.rollno}
${p.name}
<br>
</c:forEach>
<a href="sessiondata.jsp">On other page</a>
</body>
</html>