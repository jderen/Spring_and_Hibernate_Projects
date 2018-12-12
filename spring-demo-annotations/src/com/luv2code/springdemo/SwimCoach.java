package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	/*
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	*/
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
	
		//System.out.println(team+" "+email);
		return "just swim";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> SwimCoach: inside of doMyStartupStuff()");
	}
	
	// defime my destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">> SwimCoach: inside of doMyCleanupStuff()");
	}

}
