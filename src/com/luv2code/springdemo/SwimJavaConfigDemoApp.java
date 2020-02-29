package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportClass.class);
		
		//get bean from container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//call method	
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method of daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		context.close();

	}

}
