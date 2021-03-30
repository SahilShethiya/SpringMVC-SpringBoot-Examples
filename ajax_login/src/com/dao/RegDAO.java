package com.dao;

import org.hibernate.Query;
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
		
		public int check(RegVO regVO)
			{
				int len=0;
				try{
						 Session session=sessionFactory.openSession();
						 Transaction transaction=session.beginTransaction();
						 String user = regVO.getUsername();
						 String pass = regVO.getPassword();
						 Query q=session.createQuery("from RegV0 where username='"+user+"' AND password='"+pass+"'");
						 len = q.list().size();
						 session.close();
				}
				catch(Exception e)
				{}
				return len;
				}
			}