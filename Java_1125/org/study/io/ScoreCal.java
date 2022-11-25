package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class ScoreCal {
	public static void main(String[] args) {
		InputStreamReader name=null;
//		BufferedReader input=null;
		
		try {
//		Input name
			System.out.print("이름을 입력하세요: ");
			name=new InputStreamReader(System.in);
			
			BufferedReader input=new BufferedReader(name);
//		store the input name
			String name1=input.readLine();
			System.out.println("Hello, "+name1+". Please type your subject scores.");
			
//			Type of subjects
			String[] sub= {"Korean", "English", "Math"};
			
//			initialise the score carrier
			int[] scoresArr=new int[3];
			
			double sum=0.0;
			
			for (int i = 0; i < sub.length; i++) {
				System.out.print(sub[i]+":");
				String score=input.readLine();  // 여기서 read()메소드를 쓰게 되면, 다음 루프때 \n을 값으로 취급할 수도 있다.
				scoresArr[i]=Integer.parseInt(score);
				sum=sum+scoresArr[i];
			}
			System.out.println("Average: "+(sum/sub.length));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				name.close();
//				input.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	
		
	}
}
