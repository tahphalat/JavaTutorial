package aggregation;

public class Main {
	public static void main(String[] args) {
		Racket racket = new Racket("Yonex", 3.2);
		TenisPlayer player = new TenisPlayer("Ryoma", racket);
		
		System.out.println(player.getName() + " has " + racket.toString());
	}
}
