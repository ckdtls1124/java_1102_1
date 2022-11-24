package test_1124;

public class Test_1124 {
	public static void main(String[] args) {
		
		int i = 2;
		while (i<10) {			
			int j=1;
			System.out.println(i+"단 입니다.");
			while (j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;				
			}
			System.out.println(" ");
			i++;
		}
		
		
		
	}
}
