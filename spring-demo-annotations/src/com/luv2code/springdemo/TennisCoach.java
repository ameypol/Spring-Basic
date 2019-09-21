package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
// @Scope("prototype") bean scope
public class TennisCoach implements Coach {
	//field injection uses java reflection technology
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
	System.out.println("defalult const");
	}
	// define nit method annotation
	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("init method");
	}
	//define destroy method annotation
	@PreDestroy
	public void doMyStuff() {
		System.out.println("destroy method");
	}
	
	// constructor injection 
//	@Autowired 
//	public TennisCoach(FortuneService thefortuneService) {
//		this.fortuneService = thefortuneService;
//	}
	// setter injection
	/*@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}*/
	
	/*// method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
	System.out.println("method inj");
		this.fortuneService = thefortuneService;
	}*/
	


	@Override
	public String getDailyWorkout() {
				return "Practice backhand";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		return fortuneService.getFortune();
	}

}
