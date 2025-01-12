package composition;

public class Engine {
	private String brand;
	private int horsePower;

	public Engine(String brand, int horsePower) {

		this.brand = brand;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", horsePower=" + horsePower + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}
