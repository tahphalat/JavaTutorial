package Polymorphism.overRiding;

public class Main {
	public static void main(String[] args) {
		Animal animal; // parent class wait for hcild class to perform
		
		animal = new Human();
		animal.makeSound();
		
		animal = new Dog();
		animal.makeSound();
		
		animal = new Cat();
		animal.makeSound();
	}
}
