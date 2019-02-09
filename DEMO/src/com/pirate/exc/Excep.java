package com.pirate.exc;

public class Excep extends RuntimeException{
	public Excep() {
		super();
		
	}
	
	public void message() {
		System.out.println("Not eligible");
	}
}
