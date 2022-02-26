package com.wipro.other;

public class StringEg {

	public static void main(String[] args) {
		
		String str = "Akshay";
		String ptr= null;
		
		ptr = StringEg.compare(str);
		
		if(str == ptr) {
			boolean fin = (str == ptr);
			System.out.println(fin);
		}
		else
			System.out.println("Patidar");
	}
	
	public static String compare(String one) {
		return one;
	}
}
