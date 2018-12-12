package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		FootballCoach theCoach = context.getBean("footballCoach", FootballCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new football coach methods ... has the props values injected
		System.out.println("email: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		
		
		// close the context
		context.close();
		
	}

}


