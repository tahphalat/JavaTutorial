package encapsulation;

public class Main {
	public static void main(String[] args) {
		Car carA = new Car(); //Instantiation
		Car carB = new Car();
		Car carC = new Car();
		
		carA.setColor("Red");
		System.out.println(carA.getColor());
		
//		Enum
		carB.setEColor(ECarColor.White);
		System.out.println(carB.getEColor());
	}
}
