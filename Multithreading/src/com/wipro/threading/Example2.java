package com.wipro.threading;

// By implementing Runnable interface

public class Example2 {

	public static void main(String[] args) {

		Test eg1 = new Test("Thread A");
		Thread t1 = new Thread(eg1);
		t1.start();
		System.out.println("Started Thread 1");
		Test eg2 = new Test("Thread B");
		Thread t2 = new Thread(eg2);
		t2.start();
		System.out.println("Started Thread 2");
	}

}

class Test implements Runnable {
	String name;
	public Test(String name) {
		this.name = name;
	}
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
