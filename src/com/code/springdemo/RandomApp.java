package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		RandomCoach radCoach = context.getBean("myRandomCoach",RandomCoach.class);
		System.out.println(radCoach.getDailyWorkout());
		System.out.println(radCoach.getDailyFortune());
		
		context.close();
	}

}
