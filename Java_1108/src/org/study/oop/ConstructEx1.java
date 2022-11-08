package org.study.oop;

public class ConstructEx1 {

	private String userId;
	private String userPs;
	private int age;

	//	automatically compiler makes a standard constructor (return type "void" can be omitted)
	public ConstructEx1() {
		this("dfsafd"); //	when referencing other method, this(args); must be in the constructor's first line
		System.out.println("기본 생성자");
		//		ConstructEx1("dsafda"); --> not allowed


	}

	//	if the extra constructors are exiting, then standard constructors doesn't come out.
	public ConstructEx1(String id) {
		this("ckdtls1124", "charlie");
		System.out.println("id is "+id);
	}
	public ConstructEx1(String id, String ps) {
		System.out.println("id is "+id+" "+"ps is "+ps);
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPs() {
		return userPs;
	}
	public void setUserPs(String userPs) {
		this.userPs = userPs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}





}
