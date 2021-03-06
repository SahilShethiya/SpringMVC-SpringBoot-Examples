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

import vo.Country_VO;
public class RegDAO {
	
	
	public List select(Country_VO regVO1)
	{
		List ls=new ArrayList();
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from Country_VO");
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
}
