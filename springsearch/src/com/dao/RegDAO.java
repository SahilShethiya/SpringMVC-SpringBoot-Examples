package com.dao;

import java.util.ArrayList;
import java.util.List;

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
		
		public List search(RegVO regVO)
			{
						 Session session=sessionFactory.openSession();
						 Transaction transaction=session.beginTransaction();
						 Query q = session.createQuery("from RegVO where firstname LIKE '"+regVO.getFirstname()+"%' AND lastname LIKE '"+regVO.getLastname()+"%'");
						 List new_list = new ArrayList();
						 new_list = q.list();
						 session.save(regVO);
						 session.close();
						 return new_list;
			}
	}
