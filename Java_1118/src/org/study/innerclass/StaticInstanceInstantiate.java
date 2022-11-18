package org.study.innerclass;

public class StaticInstanceInstantiate {
	public static void main(String[] args) {
		
		
		int a=new StaticInstanceMemberChecking().num;
		System.out.println(a);
		
		StaticInstanceMemberChecking b=new StaticInstanceMemberChecking();
		System.out.println(b.num);
		
		String c=StaticInstanceMemberChecking.name;
		
		
	}
}	
