package org.study.DTO;

public class MemberDTO {
	private String userId;
	private String userPw;
	private String email;
	private int age;

	public MemberDTO(String id, String pw, String email, int age) {
		this.userId=id;
		this.userPw=pw;
		this.email=email;
		this.age=age;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
	
}
