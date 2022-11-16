package basicPackage;



	
public class MathEx2 {
	
	public static void main(String[] args) {
		
		int[] lotto=new int[45];
		
//		set array
		for(int i=0;i<45;i++) {
			lotto[i]=i+1;
		}
		
//		random number
		
//		System.out.println(rNum);
		
//		for statement
		
		int temp=0;
		for(int i=0;i<10;i++) {
			double a=Math.random();
			int rNum=(int)(45*a);
			temp=lotto[rNum];
			lotto[rNum]=lotto[0];
			lotto[0]=temp;
		}
		
		for(int j=0;j<6;j++) {
			System.out.print(lotto[j]+",");
		}
		
		
		
	
	}
	
	
}
