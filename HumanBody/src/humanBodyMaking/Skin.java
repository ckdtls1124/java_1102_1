package humanBodyMaking;

public class Skin {

	public String color;
	public String toughness;
	public String freckled;
	private int dots;

	//	constructor
	public Skin(String color, String toughness, String freckled) {
		this.color=color;
		this.toughness=toughness;
		this.freckled=freckled;	
	}

	public Skin(int dotsCount) {
		this.dots=dotsCount;
	}


	//	methods
	public int getDots() {
		return this.dots;
	}

	public void showTheSkinColor() {
		System.out.println("My skin color is "+color);
	}
	public void showTheSkinToughness() {
		System.out.println("My skin's toughness is "+toughness);
	}
	public void showTheSkinFreckled() {
		System.out.println("I have "+freckled);
	}

}


