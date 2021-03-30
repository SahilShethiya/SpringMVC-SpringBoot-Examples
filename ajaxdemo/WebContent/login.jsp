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
		var user =  document.getElementById("login_un");
		var pass = document.getElementById("login_pass");
		var htp = new XMLHttpRequest();
		htp.onreadystatechange=function()
		{
			if(htp.readyState==4)
				{
					alert(htp.responseText);
				}
		}
		htp.open("get","auth.jsp?un="+user.value+"&pass="+pass.value,true);
		htp.send();
		}
</script>
</head>
<body>
<h5> Login </h5>
<form  method="get">
UserName : <input type="text" id="login_un"><br>
Password : <input type="password" id="login_pass"><br>
<input type="button" onClick="check()" value="login">
</form>

</body>
</html>