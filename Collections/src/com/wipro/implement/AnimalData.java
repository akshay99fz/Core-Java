package com.wipro.implement;

public class AnimalData {
	
	String name;
	double price;
	int legs;

	public AnimalData(String name, double price, int legs) {
		super();
		this.name = name;
		this.price = price;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "AnimalData [name=" + name + ", price=" + price + ", legs=" + legs + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
}
