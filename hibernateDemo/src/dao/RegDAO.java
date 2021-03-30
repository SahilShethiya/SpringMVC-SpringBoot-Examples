package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.RegVO;

public class RegDAO {
	
	public void insert(RegVO regVO)
		{
			try
				{
					SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
					
					Session session=sessionFactory.openSession();
					
					Transaction transaction=session.beginTransaction();
					
					session.save(regVO);
					
					transaction.commit();
					
					session.close();
				}
			catch(Exception ex)
				{
					ex.printStackTrace();
				}
		}
	public List select(RegVO regVO1)
	{
		List ls=new ArrayList();
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from RegVO where firstname='"+regVO1.getFirstname() +"' ");
			ls=q.list();
			
			transaction.commit();
			
			session.close();
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ls;
	}
	public void delet(RegVO regVO2) 
	{
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.delete(regVO2);
			
			transaction.commit();
			
			session.close();
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public List edit(RegVO regVO3)
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		

		List ls=new ArrayList();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","root");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * FROM list WHERE fname ='"+regVO3.getFirstname()+"'");
		while(rs.next())
		{
			RegVO a=new RegVO();
			int id=rs.getInt("id"); 
			String fn=rs.getString("fname");
			String ln=rs.getString("lname");
			String ps=rs.getString("password");
			a.setFirstname(fn);
			a.setLastname(ln);
			a.setId(id);
			ls.add(a);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	System.out.println(ls.size());
	return ls;
	
	}
	public List edi(RegVO regVO3) {
		// TODO Auto-generated method stub
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.update(regVO3);
			
			transaction.commit();
			
			session.close();
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

}
