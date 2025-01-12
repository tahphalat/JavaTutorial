package abstractionInterface.abstraction;

class Main {
	public static void main(String[] args) {
		Car petrolCar = new PetrolCar(); // Instantiation จะสังเกตว่าเป็นการสร้าง object ที่เป็น parent class

		petrolCar.setColor("Red");
		System.out.println(petrolCar.getColor());
		petrolCar.turnLeft();

		Car elecCar = new ElectricCar();

		elecCar.setColor("Black");
		System.out.println(elecCar.getColor());
		elecCar.turnRight();

	}
}
