package encapsulation;

public class Car {
	private String color;
	private String brand;
	private int tires;
//	Enum
	private ECarColor eColor;

	public Car() {
		color = "white";
		brand = "Toyota";
		tires = 4;
	}

	// getter
	public String getColor() {
		return this.color;
	}

	public String getBrand() {
		return this.brand;
	}

	public int getTires() {
		return this.tires;
	}

	// Enum
	public ECarColor getEColor() {
		return this.eColor;
	}

	// setter
	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	// Enum
	public void setEColor(ECarColor eColor) {
		this.eColor = eColor;
	}

}
