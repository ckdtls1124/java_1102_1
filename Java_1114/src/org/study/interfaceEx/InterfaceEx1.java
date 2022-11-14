package org.study.interfaceEx;

public interface InterfaceEx1 {
//	interface InterfaceEx1 is also allowed
//	public int num1; is not allowed
	
	
//	public can be omitted
	static final int MACNUM=1000;
	
	
	
	public abstract void abstractMethod1();
	
	public static void staticMethod1() {
		System.out.println("static 메소드");
	}
	
	default void defaultMethod() {
		System.out.println("Default 메소드");
	}
	
	
	
	
	
}
