package inheritance;

public class Human extends Animal {
	public void walk(int steps) {
		System.out.println("I am a Human");
		System.out.println(this.getName() + " walk " + steps);
	}
}
