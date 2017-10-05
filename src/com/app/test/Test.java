package com.app.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.dao.DaoFactory;
import com.app.dao.DoctorDao;

public class Test {
public static void main(String[] args) {
	

	/*DoctorDao doc=DaoFactory.getInstance();
	doc.saveDoctorWithpatients();
	//doc.deletePatients();
	//doc.deleteDoctor();
}*/
	Configuration cfg = new Configuration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Query qry=session.createQuery("select d.doctorname,p.patirntName from Doctor d left join d.Patient p");
	 List li=qry.list();
	 Iterator it=li.iterator();
	 while (it.hasNext()) {
		Object rows[] = (Object[]) it.next();
		System.out.println(rows[0]+ " -- " +rows[1]);
		
	}
}
}
