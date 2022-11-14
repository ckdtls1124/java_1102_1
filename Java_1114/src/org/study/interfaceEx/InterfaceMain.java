package org.study.interfaceEx;

public class InterfaceMain {
	
	public static void main(String[] args) {
		
		
		
//		new InterfaceEx1();
		
		System.out.println(InterfaceEx1_sub.MACNUM);
		InterfaceEx1.staticMethod1();
		InterfaceEx1_sub inter1=new InterfaceEx1_sub();
		int num=inter1.MACNUM; //이와 같이 객체를 생성하고 static을 쓸 수도 있다.
		System.out.println(num);
		inter1.abstractMethod1();
		inter1.abstractMethod2();
		
		
	}
	

	
	
	
}
