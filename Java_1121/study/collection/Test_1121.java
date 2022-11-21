package org.study.collection;

public class Test_1121<T, K> {
	
	public static void main(String[] args){
		
		
		
		try {
			int[] arr=new int[5];
			
			arr[5]=10;
			System.out.println("오류 없음");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("오류 발생");
		}
		
		System.out.println("정상 실행");
		
	}	
}
