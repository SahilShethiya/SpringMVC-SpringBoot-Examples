<%
		String user = request.getParameter("un");
		String pass = request.getParameter("pass");
		if(user.equals("admin") && pass.equals("admin"))
		{
			out.println("Login Successfull");
		}
		else
		{
			out.println("Login Unsuccessfull");
		}
	%>