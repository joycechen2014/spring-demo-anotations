package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("sport.properties")
public class SportClass {
	
	//define bean for our sad fortune service
	
	@Bean
    public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for our swim coach and inject dependency
	
	@Bean
	 public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
