package model;

public class Counter {
	
	private static Counter uniqueInstance;
	private  int value = 0;
	
	
	public void setValue(int value) {
		this.value = value;
	}

	public Counter() {
	}
	
	public void count() {
		value++;
	}
	
	public void times2() {
		value = value * 2; 
	}
	
	public void zero() {
		value = 0; 
	}
	
	public int getValue() {
		return value;
	}

	public static Counter getInstances() {
		if (uniqueInstance == null) {
			uniqueInstance = new Counter();
		}
		return uniqueInstance;
	}
	
	
	
	
	
	
}
