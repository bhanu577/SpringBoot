package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		Boolean result = (theCoach == alphaCoach);
		
		System.out.println(result);
		
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);
		
		context.close();

	}

}
