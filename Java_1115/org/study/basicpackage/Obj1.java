package org.study.basicpackage;



class ObjEx1{
	
	int num1;
}




public class Obj1 {
	
	public static void main(String[] args) {
		
		
		ObjEx1 ob1=new ObjEx1();
		ObjEx1 ob2=new ObjEx1();
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		
		
	}
	
	
}
