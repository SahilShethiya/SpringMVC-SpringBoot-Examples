package delete;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet_select")
public class servlet_select extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select *from userdata");
			String user="";
			while(rs.next())
			{
				out.print(rs.getString(1)+"\t");
				out.print(rs.getString(2)+"\t");
				out.print(rs.getString(3)+"\t");
				user = rs.getString(3);
				out.println("<a href=servlet_delete?id="+user+"><input type=button name=delete value=delete></a>\t");
				out.println("<br>");
			}
		}
		catch(Exception e){
			out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
