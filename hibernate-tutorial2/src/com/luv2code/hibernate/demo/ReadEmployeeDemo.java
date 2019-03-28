package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;

public class ReadEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					
					Employee tempEmployee=new Employee("John","Black","TheCompany");	
					session.beginTransaction();
					session.save(tempEmployee);
					session.getTransaction().commit();
					
					session=factory.getCurrentSession();
					session.beginTransaction();
					Employee myEmployee=session.get(Employee.class, tempEmployee.getId());
					System.out.println(myEmployee);
					session.getTransaction().commit();
					
					// Query
					session=factory.getCurrentSession();
					session.beginTransaction();
					List<Employee> myEmployees=
							session.createQuery("from Employee").list();
					for(Employee temporaryEmployee :myEmployees) {
						System.out.println(temporaryEmployee);
					}
					session.getTransaction().commit();
					
					
				}
				finally {
					factory.close();
				}
	}

}








