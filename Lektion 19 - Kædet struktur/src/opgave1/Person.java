package opgave1;

import linkedlist.City;

public class Person {
	private String name;
	private int age; 
	
	public Person(String navn, int age) {
		this.name = name; 
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public int getAge() {
		return age; 
	}
	
	public void setAge() {
		this.age = age; 
	}
	
	@Override
	public String toString() {
		return "Navn: " + name + "Alder: " + age; 
	}
}
