package org.study.loopEx;

public class for_loop1 {
	public static void main(String[] args) {
		System.out.println("단항연산자_for");
//	 	for loop
		for(long i=0; i<=10; i++) {
//			i = i + 1;
			System.out.println("<img src='shopping_"+i+".jpg'>");
		}
//		하기 for문을 보면, 신기하게도 0부터 시작한다. 
//		for문에서만 예외적으로 단항계산식이 작동 안될 수도 있다.
		for(int num=0; num<=10; ++num) {
			System.out.println(num);
		}
		
	}
}
