package org.study.collection;

class A{
	int n;
	String s1;
	int m1() {
		return 0;
	}
	
}



class G1<T>{
	T t1;
	T m1(T t2) {
		return t2;
	}
}



public class GenericEx1{
	
	public static void main(String[] args) {
		G1<String> g1=new G1<String>();
		g1.t1="String";
		String m1=g1.m1("문자열");
//		 
		G1<Integer> g2=new G1<Integer>();
		g2.t1=new Integer(10);
		g2.t1=10;
		Integer i1=g2.m1(new Integer(10));
		int i2=g2.m1(new Integer(10)).intValue();
		int i3=g2.m1(10);
		
		
				
	}
}
