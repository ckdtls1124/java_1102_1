package org.study.GUI;


class InnerClassEx{
	class InstanceClass {
		int num1;
	}
	
	static class StaticClass{
		static final int NUMMAX=100;
	}
	
	void instanceMethod() {
		class InstanceClass1{
			void inM() {
				System.out.println("Instance class");
			}
		}
		
		InstanceClass1 a=new InstanceClass1();
		a.inM();
	}
	
	
}





public class Test1128 {
	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
}
