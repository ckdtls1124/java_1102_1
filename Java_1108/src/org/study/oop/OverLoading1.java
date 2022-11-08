package org.study.oop;

public class OverLoading1 {
	
	public void method1() {
		System.out.println("method1");
	}
	public void method1(int num1) {
		System.out.println(num1);
	}
	public void method1(int num1, String name) {
		System.out.println(num1+name);
	}
	public void method1(String name, int num1) {
		System.out.println(num1+name);
	}
}
