package org.project.dto;

public class MemberDto {
	private String userid;
	private String userpw;
	private String email;

	public MemberDto(String userid) {
		super();
		this.userid = userid;
	}

	public MemberDto(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}

	public MemberDto(String userid, String userpw, String email) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public String getEmail() {
		return email;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
