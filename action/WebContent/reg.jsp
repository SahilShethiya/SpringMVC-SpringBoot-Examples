<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="third.jsp">
First Name : <input type="text" name="fname">
<br><br>
Last Name : <input type="text" name="lname">
<br><br>
Permanent Address : <br>
<jsp:include page="address.jsp">
<jsp:param value="p" name="one"/>
</jsp:include>
<br><br>
Residental Address :<br>
 
<jsp:include page="address.jsp">
<jsp:param value="r+" name="one"/>
</jsp:include>
<br>
<input type="submit" value="Submit" >
</form>
</body>
</html>