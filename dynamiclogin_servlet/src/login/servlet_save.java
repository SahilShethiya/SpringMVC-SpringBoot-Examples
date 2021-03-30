package login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/servlet_save")
public class servlet_save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try
		{
			String username = request.getParameter("u_name");
			String firstname = request.getParameter("f_name");	
			String lastname = request.getParameter("l_name");
			String password = request.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
			Statement s = con.createStatement();
			int rs = s.executeUpdate("insert into userdata(username,pass,firstname,lastname) values('"+username+"','"+password+"','"+firstname+"','"+lastname+"') ");
			if(rs==1)
			{
				out.println("Registered Successfully");
				response.sendRedirect("login.jsp");
			}
			else
			{
				out.println("Operation failed");
			}
		}
		catch(Exception e)
		{}		
	}
}
