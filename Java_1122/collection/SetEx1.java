package org.study.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();

		set1.add("Java");
		set1.add("Database");
		set1.add("Web");
		set1.add("Servlet");
		set1.add("JSP");
		set1.add("Spring");
		System.out.println(set1);

		int size = set1.size();
		System.out.println("Number of elements: " + size);

		System.out.println();
		Iterator<String> iter = set1.iterator();
		while (iter.hasNext()) {
			String items = iter.next();
			System.out.println("Elements: " + items);

		}

		// ================================================================
		set1.clear();
		size = set1.size();
		System.out.println("Number of elements: " + size);
		if (set1.isEmpty()) {
			System.out.println("Set타입의 set1은 비어 있다.");
		}
		
		
		
		
		
	}
}
