package org.study.Singleton;

interface I1{
	
	abstract void i1();
}

interface I2 extends I1{
	
	
//	@Override
//	default void i1() {
//		// TODO Auto-generated method stub
//		
//	}

	abstract void i2();
}

interface I3 extends I2{
	
	abstract void i3();
}



public class AnonymousClass2 {
	public static void main(String[] args) {
		
		new I1() {
			
			@Override
			public void i1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		I2 a=new I2() {
			
			@Override
			public void i1() {
				// TODO Auto-generated method stub
				System.out.println("Yes1");
			}
			
			@Override
			public void i2() {
				// TODO Auto-generated method stub
				System.out.println("Yes2");
			}
		};
		
		a.i1();
		a.i2();
		
		new I3() {
			
			@Override
			public void i1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void i2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void i3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
	}
}
