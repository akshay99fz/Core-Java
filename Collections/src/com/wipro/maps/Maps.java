package com.wipro.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer,String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Akshay");
		m1.put(4, "Manas");
		m1.put(3, "Arpit");
		m1.put(2, "Dhruv");
		m1.put(2, "Ashvin");
		
//		System.out.println(m1);
//		
//		if(m1.containsKey(3)) {
//			m1.put("AS", "Arun");
//		}
//		
//		System.out.println(m1);
//		System.out.println(m1.get(1));
//		
//		for(String i : m1.keySet()) {
//			System.out.println(i);
//		}
		
		for(Map.Entry<Integer, String> i : m1.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
	}

}
