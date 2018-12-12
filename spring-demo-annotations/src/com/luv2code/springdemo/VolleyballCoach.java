package com.luv2code.springdemo;

public class VolleyballCoach implements Coach {

	private FortuneService fortuneService;
	
	public VolleyballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run hard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
