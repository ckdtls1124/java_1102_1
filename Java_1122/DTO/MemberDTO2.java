package org.study.DTO;

public class MemberDTO2 {
	private String userId;
	private String email;
	private String phone;
	private int age;
	
	public MemberDTO2(String userId, String email, String phone, int age) {
		super();
		this.userId = userId;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
	
}
