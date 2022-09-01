package com.code.springdemo;

public class CricketCoach implements Coach {
	 
	private FortuneService fortuneService;
	
	// add new fields for emailaddress and team
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAdress) {
		System.out.println("I am inside Cricket Coach class of setter method for setEmailAddress");
		this.emailAddress = emailAdress;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("I am inside Cricket Coach class of setter method for setTeam");
		this.team = team;
	}
	
	public CricketCoach() {
		System.out.println("I am inside Cricket Coach class");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I am inside Cricket Coach class of setter method for fortuneService");
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
