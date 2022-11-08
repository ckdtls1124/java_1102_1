package org.study.oop;

public class MemberDTO {
	
	private String userId;
	private String userPs;
	private int age;

//	with using Scanner, register and show the infos of the person on console
	
//	setter
	public void setUserId(String userId) {
		this.userId=userId;
	}
	
//	getter
	public String getUserId() {
		return this.userId;
	}
//	setter
	public void setUserPs(String UserPs) {
		this.userPs=UserPs;
	}
	
//	getter
	public String getUserPs() {
		return this.userPs;
	}
//	setter
	public void setAge(int Age) {
		this.age=Age;
	}
	
//	getter
	public int getAge() {
		return this.age;
	}
}
