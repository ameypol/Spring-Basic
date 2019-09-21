package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean results = (theCoach == alphaCoach);
		
		System.out.println("objects are "+ results + "\n memory loaction the coach " + theCoach + 
				"\n memory loaction alphacoach "+ alphaCoach);
		
		context.close();
	}

}
