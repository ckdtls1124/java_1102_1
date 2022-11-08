package org.study.oop;

public class CarBasic_Main {
	public static void main(String[] args) {

		//		initialize fields, print on console
		//		using getter, setter



		System.out.println("============Using standard constructor============");
		CarBasic c1=new CarBasic();
		c1.setCarName("Honda");
		c1.setCarYear(1997);
		c1.setCarCoin(454);

		String mycarName= c1.getCarName();
		System.out.println("My car name is "+mycarName);
		int mycarYear= c1.getCarYear();
		System.out.println("My car's year is "+mycarYear);
		int mycarCoin= c1.getCarCoin();
		System.out.println("My car's coin is "+mycarCoin);
		System.out.println(" ");


		System.out.println("=================using 2nd constructor===============");
		CarBasic c2=new CarBasic("Lexus");
		c2.setCarYear(1998);
		c2.setCarCoin(901);

		System.out.println("my car's name is "+c2.getCarName());
		int mycarYear1=c2.getCarYear();
		System.out.println("My car's year is "+mycarYear1);
		int mycarCoin1=c2.getCarCoin();
		System.out.println("My car's coin is "+mycarCoin1);
		System.out.println(" ");


		System.out.println("===================using 3rd constructor=======================");
		CarBasic c3=new CarBasic("BMW", 1995);
		c3.setCarCoin(4234);

		int mycarCoin2=c3.getCarCoin();
		System.out.println("My car's name is "+c3.getCarName());
		System.out.println("My car's year is "+c3.getCarYear());
		System.out.println("My car's coin is "+mycarCoin2);
		System.out.println(" ");


		System.out.println("========================sing 4th constructor=======================");

		CarBasic c4=new CarBasic("Lamborgini", 2022, 34234);
		System.out.println("My car's name is "+c4.getCarName());
		System.out.println("My car's year is "+c4.getCarYear());
		System.out.println("My car's coin is "+c4.getCarCoin());
		System.out.println(" ");




	}
}
