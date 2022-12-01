package org.study.dto;

//import java.util.ArrayList;

public class MemberDto {
	private String userId;
	private String userPw;
	private int age;

	public MemberDto(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public int getAge() {
		return age;
	}

}
