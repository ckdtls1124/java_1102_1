package humanBody;

public class Head{
	public String hair;
	public String ears;
	public String eyes;
	public String nose;
	public String mouth;
	public String cheek;
	
	
	public void Nodding() {
		System.out.println("head is nodding.");
	}
	
	public String HairMoving(String hair) {
		this.hair="y";
		this.hair="Y";
		this.hair="Yes";
		this.hair="yes";
		
		return "hair is moving";
	}
}