package org.study.thread;

//	1. Synchronise the common resources

//	2. Thread -> adhere to synchronised common resource

class ShareStorage1 {

	private String str;

	public ShareStorage1(String str) {
		this.str = str;
	}

	synchronized public char storagePrint(int i) {
		return str.charAt(i);
	}

	public String getShareString() {
		return str;
	}
}

public class Synchronize_myattempt {
	public static void main(String[] args) {
	
		
		ShareStorage1 showChar = new ShareStorage1("abcdef");

		Thread syn = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < showChar.getShareString().length(); i++) {
					System.out.print(showChar.storagePrint(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});

		ShareStorage1 showChar1 = new ShareStorage1("1234567");
		
		Thread syn1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < showChar1.getShareString().length(); i++) {
					System.out.print(showChar1.storagePrint(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		syn.start();
		syn1.start();
		
//		a12b3cd45ef67
//		a12bc3d4e5f67
//		a1b2c34d5e6f7
	}
}
