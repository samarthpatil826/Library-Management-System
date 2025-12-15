package com.jsp.sprinccore3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;

	public Car() {
		System.out.println("Car class");
		
		System.out.println("Engine : "+engine);
	}
	
	public void drive() {
		
		engine.start();
	}
}
