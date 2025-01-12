package abstractionInterface.Interface;

public class ElectricCar extends Car {

	public void speedUp(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	public void slowDown(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	public void turnLeft() {
		System.out.println("Electric car turn left");
	}

	public void turnRight() {
		System.out.println("Electric car turn right");
	}

}
