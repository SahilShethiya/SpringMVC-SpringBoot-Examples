package delete;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/edit_demo")
public class edit_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("f_name");
		String lname = request.getParameter("l_name");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("user_name");
		out.println(fname);
		out.println(lname);
		out.println(user);
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
		Statement s = con.createStatement();
		int rs = s.executeUpdate("update userdata set firstname='"+fname+"', lastname='"+lname+"' where username='"+user+"' ");
			if(rs!=0)
			{
				response.sendRedirect("servlet_select");
			}
			else
			{
				out.println("Operation failed");
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		}
	}

	

