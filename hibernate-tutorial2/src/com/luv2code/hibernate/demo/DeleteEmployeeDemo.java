package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					
					int employeeId=1;
					/*session.beginTransaction();
					session.createQuery("delete Employee where id=1").executeUpdate();					
					session.getTransaction().commit();*/
					
					employeeId=2;
					session=factory.getCurrentSession();
					session.beginTransaction();
					Employee myEmployee=session.get(Employee.class, employeeId);
					session.delete(myEmployee);
					session.getTransaction().commit();
					
				}
				finally {
					factory.close();
				}
	}

}








