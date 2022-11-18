package org.study.innerclass;

public class InnerClassBasic {
	
	class InstanceClass{
		int i=10;
		static final int NUM=100;
	}
	
	static class StaticInner{
		int i=10;
		static int i2=20;
	}
	
	public void localMethod() {
		class LocalClass{
			int i=10;
			
			static final int NUM=100;
			
			public void local1() {
				System.out.println("Method in local class");
			}
		}
		LocalClass a1=new LocalClass();
		a1.local1();
		
	}
	

}
