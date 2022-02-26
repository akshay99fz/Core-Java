package com.wipro.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CompareTo {

	public static void main(String[] args) {
		
		List<Vehicle> list1 = new ArrayList<Vehicle>();
		Vehicle v1;
		list1.add(new Vehicle("Hero", 10 , true));
		list1.add(new Vehicle("Yamaha", 4 , true));
		list1.add(new Vehicle("Suzuki", 1 , true));
		list1.add(new Vehicle("TVS", 14 , true));
		list1.add(new Vehicle("Bajaj", 20 , true));
		
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
