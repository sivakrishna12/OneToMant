package com.app.hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
private HibernateUtil(){}
	public static SessionFactory sessionFactory(){
		if(factory==null){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
	factory=cfg.buildSessionFactory();
	
		} 
		return factory;
		
	}
}

