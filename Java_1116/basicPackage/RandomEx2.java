package basicPackage;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {

		Random rNum = new Random();

		for (int i = 0; i < 5; i++) {
			int a = rNum.nextInt(45);
			System.out.println(a);
		}
		
		
		for(int i=0;i<5;i++) {
			float a=rNum.nextFloat();
			System.out.printf("%.2f\n", a);
		}
		
		
	}

}
