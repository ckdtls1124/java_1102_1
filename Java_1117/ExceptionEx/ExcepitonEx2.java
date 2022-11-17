package org.study.ExceptionEx;



public class ExcepitonEx2 {
	public static void main(String[] args) {
		System.out.println("Exception");
//		ArrayIndexOutOfBoundsExeption
		
		int[] arrInt=new int[5];
		
		try {
			for(int i=0;i<6;i++) {
				arrInt[i]=i;
			}
			System.out.println("HI");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
//			System.out.println(e.getMessage());
		} finally {
//			connection close
			System.out.println("기본 실행문");
		}
		
		
		System.out.println("프로그램 정상 실행");
		
		
		
		
	}	
}
