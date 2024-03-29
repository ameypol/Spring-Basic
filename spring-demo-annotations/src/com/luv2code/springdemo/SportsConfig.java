package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sports.properties")
public class SportsConfig {

	// define method to expose bean fortune service
	@Bean
	public FortuneService sadFortuneService() {
	 return new SadFortuneService();
	}
	
	
	//define bean for swimcaoach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
