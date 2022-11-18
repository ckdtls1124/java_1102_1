package org.study.innerclass;

public class AnonymousClassMain {
	public static void main(String[] args) {
		
		
//		this is an anonymous class
		Interface1 a=new Interface1() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("Interface method executed through anonymous class");
			}
		};
		a.execute();
		System.out.println(" ");
		
		AbstractClass b=new AbstractClass() {
			
			@Override
			void m1() {
				// TODO Auto-generated method stub
				System.out.println("Abstract class' method through anonymoust class");
			}
		};
		b.m1();
		System.out.println(" ");
		
//		A normal can be overridden
		AB c=new AB() {
			@Override
			public void AB1() {
				System.out.println("Normal class");
			}
		};
		c.AB1();
		
	}
}
