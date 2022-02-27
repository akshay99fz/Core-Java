package com.wipro.tim;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductList = new CopyOnWriteArrayList<>();
	
	/*
	 * ArrayList is not thread safe(Java do not allow it to be thread safe) because it slows down the system
	 * Vectors should be used instead of ArrayList to achieve thread safe feature
	 * You can also use CopyOnWriteArrayList, it is also thread safe
	 */
	
	/*
	 * Concurrent Collections were introduced in Java 5, those collections were thread safe 
	 * because all the methods of those collections were Synchronized
	 */
//
//	Vector<Product> soldProductList = new Vector<Product>();
//	Vector<Product> purchasedProductList = new Vector<Product>();
	public void populateSoldProduct() {
		for (int i = 0; i < 100; i++) {
			Product pro = new Product(i, "Test_Product_" + i);
			soldProductList.add(pro);
			System.out.println("Product Test_Product_" + i + " is added");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProduct() {
		for (Product prod : soldProductList) {
			System.out.println(prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
