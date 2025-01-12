package association;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	
	private List<Address> address; //
	
	//constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.address = new ArrayList<>(); //
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void addAddress(Address address) { //
		this.address.add(address);
	}
}
