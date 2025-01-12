package inheritance;

public class Main {
	public static void main(String[] args) {
		// สังเกตว่า เราไม่ได้มี speak / setter ใน Class Human เลย แต่เราสามารถใช้
		// speak/setter ที่ inherited มาจาก Animal ได้
		Human human = new Human();
		human.setName("Killua");// Animal Class
		human.speak();// Animal
		human.walk(5);// Human
		human.line();// Animal
		
		Dog dog = new Dog();
		dog.setName("Sprite");
		dog.speak();
		dog.walk(10);
		dog.line();
		
		Cat cat = new Cat();
		cat.setName("Tom");
		cat.speak();
		cat.walk(20);
		cat.line();
		
		
//		Developer dev = new Developer();
		Human dev = new Developer(); // การประกาศตัวแปรแบบนี้ หมายถึง dev จะใช้ได้แค่ properties and method ใน Human Class only
		dev.setName("William");//Animal Class
//		dev.getJob();//Developer Class
		dev.walk(100);// Human class
		dev.line();// Animal Class
		
		BusinessMan bsMan = new BusinessMan();
		bsMan.setName("Hiroshi");
		bsMan.getJob();
		bsMan.walk(200);
		bsMan.line();
	}

}
