package com.wipro.compare;

public class Vehicle implements Comparable<Vehicle>{

	String name;
	int count;
	boolean is_available;

	public Vehicle(String name, int count, boolean is_available) {
		super();
		this.name = name;
		this.count = count;
		this.is_available = is_available;
	}

	@Override
	public int compareTo(Vehicle o) {
		if(this.count > o.count )
			return -1;
		else if (this.count < o.count)
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", count=" + count + ", is_available=" + is_available + "]";
	}
	
	
}
