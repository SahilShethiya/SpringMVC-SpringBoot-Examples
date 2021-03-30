package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.Country_VO;

public class State_DAO {

	public List select(Country_VO regVO1)
	{
		List ls = new ArrayList();
		try
		{
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from State_VO where obj.id='"+regVO1.getId()+"' ");
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
