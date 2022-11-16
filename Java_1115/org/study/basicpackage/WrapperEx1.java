package org.study.basicpackage;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		
		int i=10;
		
		Integer it1=new Integer(i);
		
		System.out.println(it1);
		
//		Boxing
		Byte b2=new Byte((byte) 10);
		Short s2=new Short((short) 10);
		Integer i1=new Integer(10);

		
		Long l1=new Long(10);
		Float f1=new Float(1.1f);
		Double d1=new Double(1.1);
		Character c1=new Character('a');
		Boolean b1=new Boolean(false);
		
//		Unboxing
		System.out.println(i1.intValue());
	
		
	}
	
}
