package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> Inside default constructor");
	}
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Inside setFortuneService() method");
		fortuneService=theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> Inside doSomeCrazyStuff() method");
		fortuneService=theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService=theFortuneService;
		
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
