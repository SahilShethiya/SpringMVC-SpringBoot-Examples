<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function login()
	{
		var username = document.getElementById("username");
		var password = document.getElementById("password");
		var htp = new XMLHttpRequest();
		/* htp.onreadystatechange=function()
		{
			if(htp.readyState==4)
				{
					var jsn = JSON.parse(htp.responseText);
					for(var i=0;i<jsn.length;i++)
					{
						alert(jsn[i].key)
					}
				}
		} */
		htp.open("get","check.html?uname="+username.value+"&upass="+password.value,true);
		htp.send();
	}
</script>

</head>
<body>

	UserName : <input type="text" id = "username"/>
	Password : <input type="password" id="password"/>
	<input type="button" value="Login" onclick="login()">
	
</body>
</html>