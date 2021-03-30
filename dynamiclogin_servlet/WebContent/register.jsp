<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/servlet_save" method="post">

Enter first name : <input type="text" name="f_name"><br>
Enter last name : <input type="text" name="l_name"><br>
Enter User name : <input type="text" name="u_name"><br>
Enter Password : <input type="password" name="pass"><br>
<input type="submit" value="register">
</form>
</body>
</html>
