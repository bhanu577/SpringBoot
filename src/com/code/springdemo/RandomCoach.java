package com.code.springdemo;

public class RandomCoach implements Coach {
	private RandomFortuneService randomCoach;
	public RandomCoach(RandomFortuneService randomCoach) {
		this.randomCoach = randomCoach;
	}
	@Override
	public String getDailyWorkout() {
		return "Hey Boss";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return randomCoach.getFortuneService();
	}

}
