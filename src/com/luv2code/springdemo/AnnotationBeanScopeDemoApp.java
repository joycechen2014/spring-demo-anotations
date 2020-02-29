package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach AlphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result = theCoach ==AlphaCoach;
		
		System.out.println("\nPointing to the same object: " +  result );
		context.close();
		

	}

}
