package com.code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5KM every day";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It:"+fortuneService.getFortuneService();
	}

}
