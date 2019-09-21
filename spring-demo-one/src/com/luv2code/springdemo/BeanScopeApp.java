package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context =
new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");

Coach theCoach= context.getBean("myCoach",Coach.class);

System.out.println(theCoach.getDailyWorkout());

context.close();
	}

}
