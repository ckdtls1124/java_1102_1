package org.study.oop;

public class PrivateFieldExMain {
	
	public static void main(String[] args) {
		PrivateFieldEx ins1=new PrivateFieldEx();
		
		
		
		ins1.setUserId("ckdtls1124");
		System.out.println(ins1.getUserId());
		
		System.out.println(" ");
		ins1.setUserPw("charlie!");
		System.out.println(ins1.getUserPw());
		
		System.out.println(" ");
		ins1.setUserAge(45);
		System.out.println(ins1.getUserAge());
		
		System.out.println(" ");
		ins1.setAddress("서울시 동대문구");
		System.out.println(ins1.getAddress());
	}
	
}

