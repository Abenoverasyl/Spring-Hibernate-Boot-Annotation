package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call some method
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props value injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// close the container
		context.close();
		
	}
}
