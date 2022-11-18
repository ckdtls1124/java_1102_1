package org.study.innerclass;

public class InnerClassBasic1 {
	
//	instanceclass
	class InstanceClass2{
		int num1;
		public void m1() {
			System.out.println("InstanceClass2 in parent class");
		}
	}
	
	
	static class StaticClass2 {
		static void method1() {
			System.out.println("StaticClass2 in parent class");
		}
	}
	
	public void classShowingMethod() {
		class classInMethod{
			String a="this is a class in a method";
			
			public void methodInLocalClass() {
				System.out.println("this is a method in local class");
			}
			
		}
		
		classInMethod a=new classInMethod();
		System.out.println(a.a);
		a.methodInLocalClass();
	}
	
}
