package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call some method
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the container
		context.close();
		
	}
}
