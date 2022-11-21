package org.study.collection;

public class MemberDTO {
	
	private String userId;
	private String userPw;
	private String userName;
	private int age;
	
	public MemberDTO(String id, String pw, String name, int age) {
		this.userId=id;
		this.userPw=pw;
		this.userName=name;
		this.age=age;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	
	
}
