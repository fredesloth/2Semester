package model;

import model.Counter;

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();
		Counter c2 = new Counter();
//		C1		
		System.out.println("C1 Test: ");
		c1.setValue(8);
		c1.count();
		System.out.println("Count():" + " " + c1.getValue());
		c1.times2();
		System.out.println("Times2():" + " " + c1.getValue());

		System.out.println();
		System.out.println("C2 Test: ");
		c2.setValue(12);
		System.out.println("setValue():" + " " + c2.getValue());
		c2.count();
		System.out.println("Count(): " + c2.getValue());
		c2.times2();
		System.out.println("Times2(): " + c2.getValue() );
		c2.zero();
		System.out.println("Zero(): " + c2.getValue());

	}

}
