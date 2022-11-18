package org.study.innerclass;

import org.study.innerclass.InnerClassBasic1.InstanceClass2;
import org.study.innerclass.InnerClassBasic1.StaticClass2;

public class InnerClassBasic1Main {
	
	public static void main(String[] args) {
		
		
		
		InnerClassBasic1.InstanceClass2 a=new InnerClassBasic1().new InstanceClass2();
		a.m1();		
		
//		InnerClassBasic1.StaticClass2.method1();
		InnerClassBasic1.StaticClass2 b=new InnerClassBasic1.StaticClass2();
		b.method1();
		
		
		
//		=======================
//		System.out.println("Another way of instantiate the inner static class");
//		InnerClassBasic1.StaticClass2 staticClass=new InnerClassBasic1.StaticClass2();
//		staticClass.method1();
		
		
		InnerClassBasic1 c=new InnerClassBasic1();
		c.classShowingMethod();
		
		
		
		System.out.println(new InnerClassBasic1().new InstanceClass2());
		System.out.println(new InnerClassBasic1.StaticClass2());
		
	}

}
