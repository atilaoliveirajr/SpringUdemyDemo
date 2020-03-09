package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Batting practice";
	}

	
	// my fortuneService to get a fortune
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
