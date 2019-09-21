package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	 	private FortuneService fortuneservice;
	 	// the myFortune object is created by bean and send it over here
	 	 public TrackCoach(FortuneService myFortune) {
		
	 		fortuneservice = myFortune;
	 		// TODO Auto-generated constructor stub
		}
	@Override	
	 public String getDailyWorkout() {
		 return "spend 10 min track";
	 }

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFrotune();
	}
	
	
	// add init method
	
	public void doMyStrtuoStuff() {
		System.out.println("init method");
		
	} 
	// destroy method
	public void doMyDestryStuff() {
		System.out.println("do my destroy stuff");
	}
	
}
