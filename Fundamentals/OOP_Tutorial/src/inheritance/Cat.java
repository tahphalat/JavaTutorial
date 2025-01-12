package inheritance;

public class Cat extends Animal{
	public void walk(int steps) {
		System.out.println("I am a Cat");
		System.out.println(this.getName() + " walk " + steps);
	}
}
