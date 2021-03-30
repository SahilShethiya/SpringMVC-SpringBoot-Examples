package db_package;
import data_layer.*;
import java.util.*;
import java.sql.*;
public class myclass2 {
		public void insert(myclass1 obj)
		{
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			Statement s=c.createStatement();
			int r=s.executeUpdate("Insert into test(id,fn,ln) VALUES('"+obj.getId()+"','"+obj.getFn()+"','"+obj.getLn()+"')");
			if(r!=0)
			{
				System.out.println("data inserted/affected");
			}
			else
			{
				System.out.println("Operation failed");
			}
			s.close();
			c.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		public List search(myclass1 obj)
		{
			List al=new ArrayList();
			try
			
			{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
				Statement s=c.createStatement();
				ResultSet rs=s.executeQuery("Select * from test where fn='"+obj.getFn()+"'");
				int id;
				String fn=null;
				String ln=null;
				while(rs.next())
				{
					myclass1 v1=new myclass1();
					id=rs.getInt(1);
					fn=rs.getString(2);
					ln=rs.getString(3);
					v1.setId(id);
					v1.setFn(fn);
					v1.setLn(ln);
					al.add(v1);
					
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return al;
			
		}
		public void delete(myclass1 obj)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
				Statement s=c.createStatement();
				int rs=s.executeUpdate("Delete from test where id='"+obj.getId()+"'");
				if(rs!=0)
				{
					System.out.println("rows affected");
				}
				else
				{
					System.out.println("Operation failed");
				}

			}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
		
		
}
