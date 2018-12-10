package com.luv2code.springdemo;

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

}
