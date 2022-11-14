package org.study.interfaceEx;


class ObSub{
	
	private String name;
	private int age;
	
	public ObSub() {
		
	}
	public ObSub(String name, int age) {
		this.name=name;
		this.age=age;
	}
}




public class ObjectEx {

	public static void main(String[] args) {
		
		
		ObSub a1=new ObSub();
		ObSub a2=new ObSub();
		
		String name1="aa";
		String name2="aa3124";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		int num=32423424;
		
		
		System.out.println(" ");
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.getClass().isArray());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(name1.toString());
		System.out.println(name2.toString());
		System.out.println(name2.toString().getClass());
		
	}
	
	
	
}
