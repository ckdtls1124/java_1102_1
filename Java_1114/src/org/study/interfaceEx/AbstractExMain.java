package org.study.interfaceEx;


abstract class Ab1{
	abstract void ab1m();
}

abstract class Ab2{
	abstract void ab2m();
}

class Ab3 extends Ab1{
	
	@Override
	public void ab1m() {
		System.out.println("Hi");
	}
}


public class AbstractExMain {

}
