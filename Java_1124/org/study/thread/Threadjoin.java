package org.study.thread;

class Thread1 extends Thread{
	
	int num=1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread -> "+num++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
		}
		
	}	
}



public class Threadjoin{
	public static void main(String[] args) {
		
		
		System.out.println("Starting thread");
			
		Thread1 t1=new Thread1();
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Ending thread");
	}
}