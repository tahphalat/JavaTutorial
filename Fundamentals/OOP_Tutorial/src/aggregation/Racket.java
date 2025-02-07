package aggregation;

public class Racket {
	private String brand;
	private double weight;

	public Racket(String brand, double weight) {
		this.brand = brand;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return brand + " " + weight;
	}
}
