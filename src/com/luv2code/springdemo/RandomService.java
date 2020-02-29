package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	
	// Create an array of strings
	private String[] data = {
			"Beware of the waof in sheep's clothing",
			 "Dilligence is the mother of good luck",
			 "The journey is the reward"
	};
	
	// Create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// Pick a random number
		
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
