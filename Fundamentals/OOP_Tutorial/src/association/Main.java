package association;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 27);
		Person p2 = new Person("Jerry", 22);
		
		Address a1 = new Address("Tokyo", "1");
		Address a2 = new Address("Saitama", "3");
		
		p1.addAddress(a1);
		p2.addAddress(a2);
	}
}
