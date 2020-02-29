package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructer!");
	}
	
	//define my init method
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> TennisCoach : inside the doMyStartStuff!");
	}
	
	
	//define my destory method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside the doMyCleanupStuff!");
	}
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService");
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	
	}
	
	

}
