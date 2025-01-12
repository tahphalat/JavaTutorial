package abstractionInterface.abstraction;

class PetrolCar extends Car {

	void speedUp(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	void slowDown(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	void turnLeft() {
		System.out.println("Petrol car turn left");
	}

	void turnRight() {
		System.out.println("Petrol car turn right");
	}

}
