package com.app.dao;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.hibernateUtil.HibernateUtil;
import com.app.model.Doctor;
import com.app.model.Patient;

public class DoctorDaoImpl implements DoctorDao{
	 private SessionFactory factory;
	 DoctorDaoImpl(){
		factory=HibernateUtil.sessionFactory();
	 }
	@Override
	public void saveDoctorWithpatients() {
		Patient p1=new Patient("A",22);
		Patient p2=new Patient("B", 65);
		Patient p3=new Patient("C", 55);
		Patient p5=new Patient("B", 65);
		Patient p4=new Patient("C", 55);
		Set<Patient> par=new HashSet<Patient>();
		Set<Patient> pa=new HashSet<Patient>();
		pa.add(p4);
		pa.add(p5);
		par.add(p1);
		par.add(p2);par.add(p3);
		Doctor doc=new Doctor("siva", "MD");
		Doctor d=new Doctor("ravi", "MD");
		doc.setPatient(par);
		Session session=factory.openSession();
		session.save(doc);
		session.save(d);
		Transaction tx=session.beginTransaction();
		
		tx.commit();
		session.close();
	}
	@Override
	public void deletePatients() {
		Session session=factory.openSession();
		Doctor doctor=(Doctor) session.get(Doctor.class, 1);
		Set<Patient> pat=doctor.getPatient();
		Patient patient=(Patient) session.get(Patient.class, 2);
		Transaction tx=session.beginTransaction();
		session.delete(patient);
		tx.commit();
		session.close();
		
	}
	@Override
	public void deleteDoctor() {
		Session session=factory.openSession();
		Doctor doctor=(Doctor) session.get(Doctor.class, 1);
		Transaction tx=session.beginTransaction();
		session.delete(doctor);
		tx.commit();
		session.close();

	}

}
