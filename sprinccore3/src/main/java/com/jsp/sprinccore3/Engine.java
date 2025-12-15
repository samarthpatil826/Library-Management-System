package com.jsp.sprinccore3;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine Class");
	}
	
	public void start() {
		
		System.out.println("Engine Started");
	}
}
