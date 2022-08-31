package com.code.springdemo;

public class CricketCoach implements Coach {
	 
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("I am inside Cricket Coach class");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I am inside Cricket Coach class of setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice Defency shots for 1 hr every day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
}
