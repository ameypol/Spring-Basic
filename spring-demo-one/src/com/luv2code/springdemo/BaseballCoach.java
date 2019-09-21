package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
		private FortuneService fortuneService;
		
	 public BaseballCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	
@Override	
 public String getDailyWorkout() {
	 return "spend 30 min baseball";
 }

@Override
public String getFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFrotune();
}
}
