package com.wipro.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.entity.pan.HibernatePan;
import com.wipro.hibernate.util.HibernateUtil;
public class App 
{
    public static void main( String[] args )
    {
        Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	HibernatePan m= new HibernatePan(1,"Badari","FFZPB3");   
    	session.persist(m);
    	transaction.commit();   	
    }
}
    
