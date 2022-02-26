package com.wipro.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEg {

	public static void main(String[] args) {
		
		List<Integer> list1;
		list1 = new ArrayList<Integer>();
		list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(4);
		list1.add(85);
		
		((LinkedList<Integer>) list1).addFirst(10);
		System.out.println(list1.isEmpty());
		System.out.println(list1);
	}

}
