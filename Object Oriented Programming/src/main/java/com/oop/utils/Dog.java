package com.oop.utils;

public class Dog extends Animals{
	Dog(String name, int no_of_legs, boolean tail, boolean can_run){
		super(name, no_of_legs, tail, can_run);
	}
	
	@Override
	public void move() {
		System.out.println("Dog is running....");
	}
}
