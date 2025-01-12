package abstractionInterface.Interface;

class PetrolCar extends Car {

	public void speedUp(int speed) {
		this.setSpeed(this.getSpeed() + speed);
	}

	public void slowDown(int speed) {
		this.setSpeed(this.getSpeed() - speed);
	}

	public void turnLeft() {
		System.out.println("Petrol car turn left");
	}

	public void turnRight() {
		System.out.println("Petrol car turn right");
	}

}
