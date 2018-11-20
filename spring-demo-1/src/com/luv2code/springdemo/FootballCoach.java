package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;


	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Score 10 goals from 30 metres";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
