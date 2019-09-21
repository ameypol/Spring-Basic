package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read java config class read
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
	
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
			
		context.close();
	}

}
