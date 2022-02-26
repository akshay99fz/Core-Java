package com.wipro.fp;

public class Example {

	public static void main(String[] args) {

		try {
			Example.add(5, 9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void add(int a, int b) throws Exception {
		if (a < 10) {
			throw new Exception("Akshay Patidar");
		}
	}
}
