package com.wipro.threading;

public class Sequence {

	int value = 0;
	
	public int getNext() {
		/* This line should either complete or it should not start this is what called Atomicity
		 * to make it atomic we have to make it synchronized, we will put everything in synchronized block
		 */
		synchronized(this) {
			value = value+1; 
			return value;
		}
		
		// On more way is to define the method Synchronized "public synchronized int getNext()"

	}
}

/* This example is not thread safe because If there are two threads running the values may be repeated 
   because either one thread is not aware about what was the last value that the variable hold */
