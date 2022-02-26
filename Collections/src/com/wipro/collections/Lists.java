package com.wipro.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(3);
		list1.add(6);
		list1.add(2);
		list1.add(20);
		list1.add(28);
		list1.add(25);
		list1.forEach((n) -> System.out.print(n));
		for(int i:list2) {
			System.out.print(i);
		}
		
		System.out.println();
		List<String> ls = new LinkedList<String>();
		ls.add("Akshay");
		ls.add("Patidar");
		ls.add("Is");
		ls.add("Good");
		
		ls.forEach((i) -> System.out.print(" " + i));
		System.out.println(ls.remove(0));
		
	}

}
