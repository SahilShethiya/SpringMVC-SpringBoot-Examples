package login;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
@WebServlet("/servlet_verify")
public class servlet_verify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String log_name = request.getParameter("log_uname");
		String log_pass	= request.getParameter("log_pass");
		PrintWriter out = response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select *from userdata where username='"+log_name+"' AND pass='"+log_pass+"' ");
			String s1="",s2="";
			while(rs.next())
			{
				s1 = rs.getString("username");
				s2 = rs.getString("pass");
			}
			if(s1.equals(log_name) && s2.equals(log_pass))
			{
				session.setAttribute("uname", s1);
				response.sendRedirect("Servlet_home");
			}
			else
			{
				out.println("Invalid username or password");
				session.setAttribute("incorrect", "inc");
				response.sendRedirect("login.jsp");
			}	
		}
		catch(Exception e){}
	}
}
