package Polymorphism.OverLoading;

public class Car {
	private String color;
	private String brand;
	private int tires;

	public Car() {
		
	}
	
	//Contructor Overloading 
	public Car(String color, String brand) {
		this(color, brand, 4);
	}
	
	public void setTires(String tires) {
		this.tires = Integer.valueOf(tires);
	}

	public Car(String color, String brand, int tires) {
		this.color = color;
		this.brand = brand;
		this.tires = tires;
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

}
