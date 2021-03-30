<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String s = (String)session.getAttribute("incorrect");
		if(s!=null)
		{
			out.println("Username or Password Incorrect");
			session.removeAttribute("incorrect");
		}
	%>
	<form action="<%=request.getContextPath()%>/servlet_verify" method="post">
	User Name : <input type="text" name="log_uname" value=""><br>
	Password : <input type="password" name="log_pass" value=""><br>
				<input type="submit" value="login"/>
	</form>	
			
</body>
</html>