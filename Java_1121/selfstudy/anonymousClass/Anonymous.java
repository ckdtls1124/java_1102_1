package org.selfstudy.anonymousClass;

public class Anonymous implements Vehicle{

	Vehicle field=new Vehicle() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		
		Vehicle localvar=new Vehicle() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localvar.run();
	}
	
	
	public void method(Vehicle V) {
		V.run();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
