package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			list1.add(new Integer(i*10+10));
		}
		
		System.out.println(list1);
		
		Iterator<Integer> a=list1.iterator();
		while (a.hasNext()) {
			Integer b=a.next();
			System.out.println(b);
			
		}
		
		
		
		
		
	}
}
