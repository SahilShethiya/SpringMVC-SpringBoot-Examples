<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function fn()
	{
		var cn = document.getElementById("country");
		var st = document.getElementById("state");
		var htp = new XMLHttpRequest();
		htp.onreadystatechange=function()
		{
			if(htp.readyState==4)
				{
					var jsn = JSON.parse(htp.responseText);
					for(var i=0;i<jsn.length;i++)
					{
						var opt = document.createElement("option");
						opt.value = jsn[i].sid;
						opt.text = jsn[i].sname;
						st.options.add(opt);
					}
				}
		}
		htp.open("get","state_servlet?cn="+cn.value,true);
		htp.send();
	}
</script>
</head>
<body>
	<form method="get">
	
	Country
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
	<select id="country" onchange="fn()">
		<c:forEach items="${sessionScope.list}" var="i" >
		<option value="${i.id}">${i.name }</option>
		</c:forEach>
	</select>
	State
		<select id="state">
			<option></option>
		</select>
	</form>
</body>
</html>