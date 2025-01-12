package inheritance;

public class Animal {
	private String name;
	
	public void speak() {
		System.out.println("My name is " + this.name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void line() {
		System.out.println("\n=====================================");
	}
}
