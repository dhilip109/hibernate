package com.dev.TestHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		      
		    SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
Transaction t =session.beginTransaction();
Employee e1=new Employee();

e1.setId(6);
e1.setFirstName("fdjhfgj");
e1.setLastName("fghfg");
session.save(e1);
t.commit();

session.close();
System.out.println("succesfully saved");

}
}
