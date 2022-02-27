package com.wipro.threading;

public class SeqTest {

	public static void main(String[] args) {

		Sequence seq = new Sequence();
//		for (int i=0;i<10;i++) {
//			System.out.println(seq.getNext());
//		}

		NextValue nxt = new NextValue(seq);
		nxt.start();
		NextValue nxt1 = new NextValue(seq);
		nxt1.start();
	}

}

class NextValue extends Thread {

	Sequence seq = null;

	public NextValue(Sequence seq) {
		this.seq = seq;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(seq.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
