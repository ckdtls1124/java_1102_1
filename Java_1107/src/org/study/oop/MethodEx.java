package org.study.oop;

public class MethodEx {
	
//	here is where methods are executed
	public static void main(String[] args) {
		
//		class' method 
		System.out.println(MethodEx.method2());
		
//		instancing the class 
		MethodEx mEx=new MethodEx();
		
//		instance's method
		mEx.method3();
		System.out.println(mEx.method3());
		
//		instance's method with parameters
		mEx.method4(10, 20);

		
//		instance's method with parameters
		mEx.method5(10, 20); // this gives out only the printing
		int a=mEx.method5(10, 299);
		System.out.println(a); // this gives out the return value and the printing value
		
		mEx.method6(40, 20, "*");
	}
	
		
		
	// void == nothing to return; no parameter;
//	in this reason, return can be omitted
	public void method() {
	
	}
	
	
//	return type == int; no parameter 
	public  static int method2() {
//		local variable
		int num1=23;
		int num2=45;
		
		return num1*num2;
	}
	
	public String method3() {
		return "name";
	}
	
	
//	no return type, parameter;
	public void method4(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	
//	return type, parameter;
	public int method5(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("반환값 int, 매개인자 2개");
		
		return sum;
	}
//	==================================================calculator=============
		
	public void method6(int num1, int num2, String op) {
		
		if(op.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(op.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(op.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(op.equals("/")) {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		else if(op.equals("%")) {
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		}
		
			
	}	
}	

