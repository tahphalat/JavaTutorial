package abstractionInterface.abstraction;

abstract class Car { // เป้น default class = able only class in package to access data
	private String color;
	private int speed;
	
	public Car() {
		color = "white";
	}

	// getter
	public String getColor() {
		return this.color;
	}
	public int getSpeed() {
		return this.speed;
	}

	// setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	abstract void speedUp(int speed);
	abstract void slowDown(int speed);
	abstract void turnLeft();
	abstract void turnRight();

}
