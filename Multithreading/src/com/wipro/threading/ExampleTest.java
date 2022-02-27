package com.wipro.threading;

// By Extending Thread Class

public class ExampleTest {

	public static void main(String[] args) {

		Example eg1 = new Example("Thread A");
		eg1.start();
		System.out.println("Started Thread 1");
		Example eg2 = new Example("Thread B");
		eg2.start();
		System.out.println("Started Thread 2");
	}

}

class Example extends Thread {
	String name;
	public Example(String name) {
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
