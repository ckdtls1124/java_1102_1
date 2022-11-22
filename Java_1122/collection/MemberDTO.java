package org.study.collection;

public class MemberDTO {
	
	
	private String userId;
	private String userPw;
	private String userName;
	private int age;
	
	public MemberDTO(String userId, String userPw, String userName, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
