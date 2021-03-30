
	package dao;

	import java.io.*;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	import vo.*;
	import java.sql.*;

	public class regdao {

		public List search(Regvo obj)
		{
			List ls = new ArrayList();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("select *from userreg where firstname='"+obj.getFn()+"'");
				String s_fn="",s_ln="";
				int s_id;
				
				while(rs.next())
				{
					Regvo v1 = new Regvo();
					s_id = rs.getInt(1);
					s_fn=rs.getString(2);
					s_ln=rs.getString(3);
					v1.setId(s_id);
					v1.setFn(s_fn);
					v1.setLn(s_ln);
					ls.add(v1);
				}		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return ls;
		}
	}
