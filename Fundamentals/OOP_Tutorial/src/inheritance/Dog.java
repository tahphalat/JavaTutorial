package inheritance;

public class Dog extends Animal{
	public void walk(int steps) {
		System.out.println("I am a Dog");
		System.out.println(this.getName() + " walk " + steps);
	}
}
