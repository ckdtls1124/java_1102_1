package org.study.Singleton;

interface A{
	abstract void ab1();
}

class B implements A{
	
	@Override
	public void ab1() {
		System.out.println("1. Overriding method from interface A");
	}
}



public class AnonymousClass1 {
	public static void main(String[] args) {
		A a=new B();
		a.ab1();
		
		A c=new A() {
			
			@Override
			public void ab1() {
				// TODO Auto-generated method stub
				System.out.println("2. Overriding from anonymous class");
			}
		};
		c.ab1();
	}
}
