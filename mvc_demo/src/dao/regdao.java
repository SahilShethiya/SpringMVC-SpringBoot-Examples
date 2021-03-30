package dao;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import vo.*;
import java.sql.*;
/**
 * Servlet implementation class regdao
 */
@WebServlet("/regdao")

public class regdao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void insert(Regvo obj)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
			Statement s = con.createStatement();
			int rs = s.executeUpdate("insert into userreg(firstname,lastname) values('"+obj.getFn()+"','"+obj.getLn()+"') ");
			if(rs>0)
			{
				System.out.println("Inserted Successfully");
			}
		}
		catch(Exception e)
		{
			//out.println(e);
		}
	}
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	   
   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
