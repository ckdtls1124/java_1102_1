package org.study.interfaceEx;



interface A{
	void a1();
}

interface C{
	abstract void c1();
}

//	between interfaces, "extends" keyword is used
interface B extends A, C{
	void b1();
}


class AB implements B{

	@Override
	public void c1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		System.out.println("this is a");
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("this is b1");
	}
	
}

public class CanInterfaceBeInherited {

	public static void main(String[] args) {
		
		A a=new AB();
		a.a1();
		
		AB a1=new AB();
		a1.b1();
		
		
	}
	
}
