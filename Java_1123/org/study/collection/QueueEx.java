package org.study.collection;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		
		LinkedList<String> qu=new LinkedList<String>();
		qu.add("넷");
		qu.add("셋");
		qu.add("둘");
		qu.add("하나");
		qu.add("여섯");
		
		System.out.println(qu.peek());
		System.out.println(qu);
		
 		System.out.println(qu.poll());
 		System.out.println(qu);
 		
 		qu.remove("둘");
 		System.out.println(qu);
		
	}
}
