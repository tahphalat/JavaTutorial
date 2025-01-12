package composition;

public class Car {

	private final String brand;
	private final Engine engine;

	public Car(String brand) {
		this.brand = brand;
		this.engine = new Engine("E", 2000); // เราไม่ใส่มาในรูป parameter เเต่เราทำกทารสร้างขึ้นเอง เพื่อให้เห็นภาพ composition ที่ หาก car class หาย engine ก็จะหายไปด้วย
	}

	public String getBrand() {
		return brand;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	
	

}
