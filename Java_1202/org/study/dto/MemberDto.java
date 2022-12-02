package org.study.dto;

public class MemberDto {
	private String id=null;
	private String pw=null;
	private String age=null;
	private String email=null;
	
	public MemberDto(String id, String pw, String age, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.email=email;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
