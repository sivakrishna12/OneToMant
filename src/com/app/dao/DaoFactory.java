package com.app.dao;

public class DaoFactory {
private static DoctorDao dao;
private DaoFactory(){}
public static DoctorDao getInstance(){
	if(dao==null){
		dao=new DoctorDaoImpl();
	}
	return dao;
	
}
}
