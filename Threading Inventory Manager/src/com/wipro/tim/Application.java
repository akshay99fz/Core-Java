package com.wipro.tim;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager im = new InventoryManager();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				im.populateSoldProduct();
			}
		});

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				im.displaySoldProduct();
				;
			}
		});

		t.start();
//		try {
//			Thread.sleep(12000);    // One way of pausing 1 thread so that other could complete
//			t.join();				// It allows first thread to finish and then second starts
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Thread.sleep(1000);
		t1.start();
	}

}
