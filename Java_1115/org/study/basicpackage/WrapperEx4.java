package org.study.basicpackage;

public class WrapperEx4 {

	public static void main(String[] args) {

	
	Integer i10=new Integer(10); //boxing
	int i11=i10.intValue(); //unboxing 
	
	Integer i20=10; //automatic boxing
	int i22=10; // it's same with the below ones
	int i23=new Integer(10);
	
	
	
	System.out.println("문자열"+i10.toString());
	
	Character c10=new Character('a');
	char c11=c10.charValue();
	
	Boolean b10=new Boolean(false);
	boolean b11=b10.booleanValue();
	
	Float f10=new Float(1.1f);
	float f11=f10.floatValue();
	
//	String sf10=new String("dd");
	String sf10="dd"; // 이와 같이, string을 자동 박싱으로 해오고 있었따.
	String sf101=f10.toString();
	System.out.println("문자열: "+sf101);
	
	Double d10=new Double(1.1);
	double d11=d10.doubleValue();
	
	}

}
