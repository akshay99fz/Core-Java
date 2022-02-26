package com.wipro.more;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Object obj = new Object();
		String abc = "Akshay";
		obj = abc;
		
		System.out.println(obj);
		
//		Employee emp = new Employee();
//		Engineer eng = new Engineer();
//		emp = eng;
		
		ArrayList<Employee> list1 = new ArrayList<>();
		list1.add(new Employee());
		ArrayList<Engineer> list2 = new ArrayList<>();
		list2.add(new Engineer());
//		list1 = list2;        	// This will give error because ArrayList here is generic class
		
		ArrayList<?> list3 = new ArrayList<>();
		ArrayList<Engineer> list4 = new ArrayList<>();
		list3 = list4;          // Using wild card ? we can achieve it.
		
//		ArrayList<? extends Employee> list5 = new ArrayList<>();
//		ArrayList<String> list6 = new ArrayList<>();
//		list5 = list6;			// Because String class is not child of Employee class
		
		
		/* This is to make an upper bound in your code */
		ArrayList<? extends Employee> list7 = new ArrayList<>();
		ArrayList<Engineer> list8 = new ArrayList<>();
		list7 = list8;			// Worked because Engineer class is child of Employee class
		
		/* This is to make lower bound in your code */
		ArrayList<? super Employee> list9 = new ArrayList<>();
		ArrayList<Object> list10 = new ArrayList<>();
		list9 = list10;			// Worked because Engineer class is child of Employee class
		
		makeEmpWork(list1);
		makeEmpWork(list2);
	}
	
	public static void makeEmpWork(List<? extends Employee> employees) {
		for(Employee emp : employees)
			emp.work();
	}

}
