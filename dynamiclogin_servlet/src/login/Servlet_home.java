package login;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Servlet_home")
public class Servlet_home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   		PrintWriter out = response.getWriter();
   		try{
   		HttpSession session = request.getSession();
   		
   		String id = (String)session.getAttribute("uname");
   		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select *from userdata where username='"+id+"' ");
		String fn="",ln="";	
		while(rs.next())
			{
				fn = rs.getString(1);
				ln = rs.getString(2);
			}
		
		out.println("Hello : "+fn+" "+ln);
		
   		}
   		catch(Exception e)
   		{
   			out.println(e);
   		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
