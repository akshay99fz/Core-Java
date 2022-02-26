package com.wipro.sets;

import java.util.HashSet;
import java.util.Set;

public class TestHuman {

	public static void main(String[] args) {
		
		Set<Human> h1 = new HashSet<Human>();
		h1.add(new Human("Akshay", "Male", 25));
		h1.add(new Human("Abhay", "Male", 23));
		h1.add(new Human("Aarti", "Female", 22));
		h1.add(new Human("Akshay", "Male", 25));
		
		h1.forEach((x) -> System.out.println(x));
	}

}
