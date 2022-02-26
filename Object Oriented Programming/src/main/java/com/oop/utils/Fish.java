package com.oop.utils;

public class Fish extends Animals{

	Fish(String name, int no_of_legs, boolean tail, boolean can_run) {
		super(name, no_of_legs, tail, can_run);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming...");
		
	}
	
	
}
