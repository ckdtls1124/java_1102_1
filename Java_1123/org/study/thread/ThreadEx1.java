package org.study.thread;


class ThreadSub extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread에 run 메소드");
	}
	
}



public class ThreadEx1 {
	public static void main(String[] args) {
		
		Runnable hihi=new ThreadSub();
		hihi.run();
		
		
		
		
	}
}
