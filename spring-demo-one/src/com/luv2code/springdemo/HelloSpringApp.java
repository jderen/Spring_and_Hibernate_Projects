package com.luv2code.springdemo;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXlmApplicationContext context=
		new ClassPathXlmApplicationContext("applicationContext.xml");		
		// retrieve bean from spring container
		
		// call methods on the bean
		
		// close the context

	}

}
