package test_1125;

class Thread1 implements Runnable {
	
	private String status;
	
	public Thread1(String status) {
		this.status=status;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("현재 상태는 "+this.status+" 입니다.");
	}
	
}





public class ThreadEX {
	public static void main(String[] args) {
		
		Thread a1=new Thread(new Thread1("1번째"));
		Thread a2=new Thread(new Thread1("2번째"));
		Thread a3=new Thread(new Thread1("3번째"));
		Thread a4=new Thread(new Thread1("4번째"));
		Thread a5=new Thread(new Thread1("5번째"));		
		Thread a6=new Thread(new Thread1("6번째"));
		
				
		try {
			a1.start();
			a1.join();
			
			a2.start();
			a2.join();
			
			a3.start();
			a3.join();
			
			a4.start();
			a4.join();
						
			a5.start();
			a5.join();
			
			a6.start();
			a6.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("End of threads");
		}
		
		
	}
}
