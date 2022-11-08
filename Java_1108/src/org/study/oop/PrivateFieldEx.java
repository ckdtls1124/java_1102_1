package org.study.oop;

public class PrivateFieldEx {
	
	private String userId;
	private String userPw;
	private int userAge;
	private String Address;
	
	
//	setter ->	right part "userId" will initialize the private "userId"
	public void setUserId(String userId) {
		
		this.userId=userId;

	}

//	getter -> this will return the value of setUserId
	public String getUserId() {
		return this.userId;
	}
	
//	=================================
	
//	setter
	public void setUserPw(String userPw) {
		
		this.userPw=userPw;
	}

//	getter
	public String getUserPw() {
		
		return this.userPw;
	}
	
//	===================================
	
//	setter
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	
//	getter
	public int getUserAge() {
		return this.userAge;
	}
	
//	====================================
	
//	setter
	public void setAddress(String address) {
		this.Address=address;
	}
	
//	getter
	public String getAddress() {
		return this.Address;
	}
	
	
	
}
