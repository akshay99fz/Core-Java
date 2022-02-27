package com.wipro.pc;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	/*
	 * This is an example of Producer and Consumer design pattern in Multi-threading
	 */

	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList<Integer>();
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Consumer(questionList));
		t1.start();
		t2.start();
	}

}
