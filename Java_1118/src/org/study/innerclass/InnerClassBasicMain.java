package org.study.innerclass;

public class InnerClassBasicMain {
	public static void main(String[] args) {
		
		System.out.print("Innerclass' instance class: ");
		InnerClassBasic a=new InnerClassBasic();
		InnerClassBasic.InstanceClass a1=new InnerClassBasic().new InstanceClass();
		System.out.println(a1.i);
		System.out.println("");
		
		System.out.println("Innerclass' static class: "+InnerClassBasic.StaticInner.i2);
		System.out.println(" ");
		
		InnerClassBasic b=new InnerClassBasic();
		System.out.print("Innerclass' method's class: ");
		b.localMethod();
		
	}
}
