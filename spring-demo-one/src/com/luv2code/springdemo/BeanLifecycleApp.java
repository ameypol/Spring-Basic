package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context =
new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

Coach theCoach= context.getBean("myCoach",Coach.class);
Coach alphaCoach = context.getBean("myCoach",Coach.class);

boolean result = (theCoach == alphaCoach);

System.out.println("object are same? " + result + " "+ theCoach +" " + alphaCoach);
context.close();
	}

}
