package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the bean from config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		//call the method on file
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//close the context
		context.close();
	}

}
