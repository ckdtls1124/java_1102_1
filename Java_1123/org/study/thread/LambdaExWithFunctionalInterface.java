package org.study.thread;

@FunctionalInterface
interface Example1<T> {
	
	abstract T work();
	
	default void defaultMethod() {
		System.out.println("This is a default method.");
	}
}

public class LambdaExWithFunctionalInterface {

	public static void main(String[] args) {
		
		Example1<String> a=()->"It's working perfect";
		String b=a.work();
		
		System.out.println(b);
		a.defaultMethod();
	}

}
