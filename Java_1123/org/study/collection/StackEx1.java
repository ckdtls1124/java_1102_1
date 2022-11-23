package org.study.collection;

import java.util.Stack;

public class StackEx1 {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> st=new Stack<>();
		
		
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println(st.peek());
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println( );
		System.out.println(st.search(6));
		System.out.println(st.search(5));
		System.out.println(st.search(4));
		System.out.println(st.search(3));
		System.out.println(st.search(2));
		System.out.println(st.search(1));
		System.out.println(st);
		
	}
	
	
}
