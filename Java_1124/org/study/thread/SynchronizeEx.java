package org.study.thread;

class ShareStorage {
	synchronized void storagePrint(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println( );
	}
}

class Thread4 extends Thread {
	private ShareStorage share;
	private String str;
	
	public Thread4(ShareStorage share, String str) {
		super();
		this.share=share;
		this.str=str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		share.storagePrint(str);
	}
}


public class SynchronizeEx {
	public static void main(String[] args) {
		
		ShareStorage s1=new ShareStorage();
		ShareStorage s2=new ShareStorage();
		
		String str1="abcdef";
		String str2="1234567";
		
		Thread4 t1=new Thread4(s1, str1);
		Thread4 t2=new Thread4(s2, str2);
		
		t1.start();
		t2.start();
	
//		a1b2c3d4e5f67
//		a1b2c34d5ef67
//		a12bc3d4e56f7
//		a1b2c34de56f7
	}
}
