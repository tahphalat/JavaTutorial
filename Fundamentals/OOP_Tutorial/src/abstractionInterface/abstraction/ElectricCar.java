package abstractionInterface.abstraction;

public class ElectricCar extends Car {

	void speedUp(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	void slowDown(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	void turnLeft() {
		System.out.println("Electric car turn left");
	}

	void turnRight() {
		System.out.println("Electric car turn right");
	}

}
