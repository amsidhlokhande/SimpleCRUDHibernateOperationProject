package com.amsidh.hibernate.app;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.amsidh.hibernate.domains.UserDetails;

public class HibernateTest {

	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*for(int i=0;i<10;i++)
		{
			UserDetails user=new UserDetails();
			user.setUserName("User "+i);
			session.save(user);
		}
*/		
		
		/*UserDetails user=(UserDetails)session.get(UserDetails.class, 6);
		System.out.println(user.getUserName());*/
		
		
		/*UserDetails user=(UserDetails)session.get(UserDetails.class, 6);
		System.out.println(user.getUserName());
		session.delete(user);*/
		
		UserDetails user=(UserDetails)session.get(UserDetails.class, 5);
		System.out.println(user.getUserName());
		user.setUserName("New User Name");
		
		session.getTransaction().commit();
		session.close();
		
	}

}
