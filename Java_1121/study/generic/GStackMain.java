package org.study.generic;

public class GStackMain {
	public static void main(String[] args) {
		
		GStack<Integer> addNum=new GStack<Integer>();
		int lengthAddNum=addNum.oStack.length;
		
		for (int i = 0; i < lengthAddNum; i++) {
			int i2=i*10+10;
			addNum.push(i2);
			System.out.println(addNum.oStack[i]);
//			System.out.println(addNum.pop());
		}
		
		for (int i = 0; i < lengthAddNum; i++) {
			System.out.println(addNum.pop());
		}
		
		
		
	}
}
