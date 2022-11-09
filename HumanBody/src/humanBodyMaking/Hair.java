package humanBodyMaking;

public class Hair {

	public String hairColor;
	public String curliness;
	public int length;
	
//	constructor
	public Hair(String hairColor, String curliness, int length) {
		this.hairColor=hairColor;
		this.curliness=curliness;
		this.length=length;
	}
	
//	methods
	
	public void showMyHairColor() {
		System.out.println("My hair color is "+this.hairColor);
	}
	
	public void showMyHairStyle() {
		System.out.println("My hair style is "+this.curliness);
	}
	
	public void showMyHairLength() {
		System.out.println("My hair length is "+this.length+"cm long.");		
	}

}

