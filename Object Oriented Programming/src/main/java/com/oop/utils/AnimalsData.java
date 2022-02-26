package com.oop.utils;

public class AnimalsData {

	public static void main(String[] args) {
		
		Animals g1;
		g1 = new Dog("street_dog", 4, true, true);
		g1.move();
		
		Fish f = new Fish("Sea_fish", 0, false, false);
		f.move();
		
		AnimalsData.moveAnimal(f);
		AnimalsData.moveAnimal(g1);
		
		
	}

	public static void moveAnimal(Animals animal) {
		animal.move();
	}
}
