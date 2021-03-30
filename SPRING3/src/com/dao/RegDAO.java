package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.*;

@Repository
public class RegDAO
	{
		@Autowired
		SessionFactory sessionFactory;
		
		public void insert(RegVO regVO)
			{
				try
					{
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
