package org.study.operatorEx;



public class Operator11 {
	public static void main(String[] args) {
		System.out.println("삼항 연산자");
		
		
		int num=10;
		
		int result=num>10?1:0;
		System.out.println("결과:"+result);

		boolean bool1=num>10? true:false;
		System.out.println("결과:"+bool1);
		
		String str=num>10? "num은 10보다 큽니다.":"num은 10보다 크지 않습니다.";
		System.out.println("결과:"+str);
		
		
		
		
		
	}
	
}

