package org.study.gui;

class A{
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A's basic constructor");
	}
}

class B{
	private A a;
	
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B's basic constructor");
	}
	
	public B(A a) {
		this.a=a;
	}
	
	public A getA() {
		return a;
	}
}



public class ClassDI {
	public static void main(String[] args) {
		A c=new A(); 
		B d=new B(c);
		System.out.println(d.getA());
		
		
		
	}
}
