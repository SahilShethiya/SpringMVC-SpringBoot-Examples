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
import vo.userVO;


public class RegDAO {
	
	public void insert1(userVO uservo)
	{
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(uservo);
			
			transaction.commit();
			
			session.close();
		}
	catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
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
}
