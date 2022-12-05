package org.study.dto;

public class MemberDto {
	private String userid=null;
	private String userpw=null;
	private String name=null;
	private int userAge=0;
	private String email=null;
	
	public MemberDto(String userid, String userpw, String name, int userAge, String email) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.userAge = userAge;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public String getName() {
		return name;
	}

	public int getUserAge() {
		return userAge;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
