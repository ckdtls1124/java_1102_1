package basicPackage;

import java.util.Random;


public class RandomEx1 {
	
	public static void main(String[] args) {
		

		Random rNum=new Random();
		
		int a=rNum.nextInt(100);
		System.out.println(a);
		long b=rNum.nextLong();
		System.out.println(b);
		int c=rNum.nextInt();
		System.out.println(c);
		float d=rNum.nextFloat();
		System.out.println(d);
		double e=rNum.nextDouble();
		System.out.println(e);
				
		
	
	}
	
	
}
