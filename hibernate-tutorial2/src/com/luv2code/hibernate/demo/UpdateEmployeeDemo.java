package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class UpdateEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					int EmployeeId=1;
					
					session.beginTransaction();
					Employee theEmployee=session.get(Employee.class, EmployeeId);
					theEmployee.setCompany("Comp");
					session.getTransaction().commit();
					
					
					session=factory.getCurrentSession();
					session.beginTransaction();
					session.createQuery("update Employee set company='Comp2'").executeUpdate();
					session.getTransaction().commit();
					
				}
				finally {
					factory.close();
				}
	}

}








