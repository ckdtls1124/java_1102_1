package org.study.oop;

public class MethodBasic {
	
	public void method1() {
		System.out.println("No return value, no parameter");
	}
	
	public int method2() {
		int a=2;
		int b=4;
		System.out.println("return value yes, no parameter");
		return a+b;
	}
	public void method3(int a, int b) {
		System.out.println("no return values, yes parameter, ");
		System.out.println(a+b);
	}
	public int method4(int a, int b) {
		System.out.println("both return values, parameter are present ");
		System.out.println(a+b);
		return a+b;
	}
	
//	class' methods
	public static void method5() {
		System.out.println("class' method");
		
	}
		
		
}
