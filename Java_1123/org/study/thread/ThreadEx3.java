package org.study.thread;



class ThreadSub2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Interface through normal thread initialising.");
	}

}

public class ThreadEx3 {
	public static void main(String[] args) {
//		1. normal thread initialising 
		Runnable a=new ThreadSub2();
		Thread b=new Thread(a);
		b.start();
		
//		2. thread + anonymous class
		Thread c=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable Interface through anonymous class.");
			}
		});
		c.start();
		
//		3. Lambda
		Thread d=new Thread(()->{
			System.out.println("Runnable Interface through lambda.");
		});
		d.start();
	}
}
