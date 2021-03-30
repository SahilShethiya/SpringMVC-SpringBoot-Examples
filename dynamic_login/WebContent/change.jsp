<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function check()
	{
		var x1 = document.getElementById("s1");
		 var x2 = document.getElementById("s2"); 
		var x3 = document.getElementById("chg");
		if(x1.value==x2.value)
			{
				x3.style.display="";
			}
		else
			{
				x3.style.display= "none";
			}
	}
</script>
</head>
<body>
<form action="process_change.jsp">
Old password : <input type="text" name="old_pass" ><br>
New password : <input type="text" name="new_pass" id="s1"><br>
Confirm new Password : <input type="text" name="conf_pass" id="s2" onkeyup="check()"><br>
<input type="submit" value="change" id="chg" style="display: none;">
</form>
<%@page import="java.sql.*" %>
<%
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
	Statement s = con.createStatement();
	//ResultSet rs = s.executeQuery("select *from userdata where username='"+name+"' ");
	
%>
</body>
</html>