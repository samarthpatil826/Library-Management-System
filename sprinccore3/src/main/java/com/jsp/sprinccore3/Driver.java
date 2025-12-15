package com.jsp.sprinccore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
//		ac.getBean(Car.class);
		
		Car cr = ac.getBean(Car.class);
		
		System.out.println(cr);
		
		Engine eg = ac.getBean(Engine.class);
		System.out.println(eg);
		
	}
}
