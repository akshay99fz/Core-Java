package com.wipro.implement;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	public static void main(String[] args) {
		
		List<AnimalData> ls = new ArrayList<AnimalData>();
		AnimalData a1 = new AnimalData("Akshay", 123.4, 4);
		ls.add(a1);
		ls.add(new AnimalData("Karan", 120.1, 3));
		
		ls.forEach((x) -> System.out.println(x));
		
		
	}

}
