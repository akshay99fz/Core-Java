package com.oop.utils;

public abstract class Animals {

	String name;
	int no_of_legs;
	boolean tail;
	boolean can_run;

	Animals(String name, int no_of_legs, boolean tail, boolean can_run){
		this.name = name;
		this.no_of_legs = no_of_legs;
		this.tail = tail;
		this.can_run = can_run;
	}
	
	public abstract void move();

}
