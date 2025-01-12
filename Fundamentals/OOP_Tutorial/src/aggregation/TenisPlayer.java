package aggregation;

public class TenisPlayer {
	private String name;
	private Racket racket;

	public TenisPlayer(String name, Racket racket) {
		this.name = name;
		this.racket = racket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Racket getRacket() {
		return racket;
	}

	public void setRacket(Racket racket) {
		this.racket = racket;
	}
	
	public String toString() {
		return name + " " + racket;
	}

}
