package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call method	
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method of daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();

	}

}
