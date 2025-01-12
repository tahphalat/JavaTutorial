package abstractionInterface.Interface;

abstract class Car implements ChangeSpeed, Turn{
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

}
