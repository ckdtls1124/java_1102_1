package org.study.thread;


class Task implements Runnable{
	
	public void run() {
		System.out.println("Run the thread");
	}
}




public class ThreadVsRunnable {
	public static void main(String[] args) {
		
			
		
		
		Runnable a=new Task();
		Thread work=new Thread(a);
		work.start();
		
		
		Thread b=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Whatthefuck");
			}
		});
		b.start();
		
	}
}
