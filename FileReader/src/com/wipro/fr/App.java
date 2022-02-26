package com.wipro.fr;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing...");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		try(MyClass mc = new MyClass();){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
