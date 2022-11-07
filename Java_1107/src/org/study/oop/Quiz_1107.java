package org.study.oop;

public class Quiz_1107 {
	public static void main(String[] args) {
		
		for(int i=4;i<10;i++) {
			for(int j=1;j<10;j++) {
				
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("=========================");
		
		int i=9;
		while(i>3) {
			
			int j=1;
			while(j<10) {
				
				System.out.println(i+"*"+j+"="+(i*j));
				
				j++;
			}
			
			
			i--;
		}
		System.out.println("===============================");
		
		int num=9;
		do {
			
			int j=1;
			do {
				
				System.out.println(num+"*"+j+"="+(num*j));
				
				j++;
			}while(j<10);
			
			num--;
		}while(num>3);
		
		System.out.println("======================================");
		int[] arr1=new int[10];
		
		for(int ar=0;ar<10;ar++) {
			
			arr1[ar]=(ar+1)*10;
			System.out.print(arr1[ar]+",");
		}
		System.out.println("\n");
		System.out.println("===========================================");
//				System.out.println("Lottery number");
//				
////				initialize the array of numbers
//				int number_table[]=new int[45];
//				
////				get the number range from 1 to 45;
//				for(int i=0; i<45; i++) {
//					number_table[i]=i+1;
//				}
//				
//				
////				Math.random() method randomly selects double type including 0 to under 1.
//				
////				double a = Math.random();
////				System.out.println(a);
//				
////				System.out.println(random_num);
//				
////				mix number table
////				when number was randomly selected, index 0's number goes to that number's index, and the selected index's number goes to index0
////				iterate it for 1000 times
//				
//				int carrier; // number carrier of randomly selected number
//				for (int i = 0; i < 1000; i++) {
//					
//					int random_num = (int)(45*Math.random());
//					carrier=number_table[random_num];
//					number_table[random_num]=number_table[0];
//					number_table[0]=carrier;
//					
//				}
//					
//				System.out.println("로또 번호는 하기와 같습니다.");
//				for(int i=0; i<6; i++) {
//					if (i==5) {
//						System.out.print(number_table[i]);				
//					} else {
//						System.out.print(number_table[i]+",");
//					}
//				}
				
				
			
		
	}
}
