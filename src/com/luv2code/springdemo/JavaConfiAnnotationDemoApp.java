package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfiAnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportClass.class);
		
		//get bean from container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call method	
		System.out.println(theCoach.getDailyWorkout());
		
		// call our new swim coach method
		
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// call new method of daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();

	}

}
