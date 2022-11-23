package org.study.thread;

interface Inter1 {
	void interm1();
//	void interm2();
}

public class LambdaEx1 {
	public static void main(String[] args) {
		
		Inter1 a=new Inter1() {
			
			@Override
			public void interm1() {
				// TODO Auto-generated method stub
				System.out.println("It has been incarnated through anonymous class");
			}
		};
		
		a.interm1();
		
		
		Inter1 b=()->{
			System.out.println("It has been incarnated through lambda.");
		};
		b.interm1();
	}
}
