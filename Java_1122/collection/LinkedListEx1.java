package org.study.collection;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListEx1 {
	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);

		// LinkedList
		LinkedList<Integer> i1 = new LinkedList<Integer>();
		LinkedList<Integer> i2 = new LinkedList<>();
		LinkedList<Integer> i3 = new LinkedList<>(a1);

		for (int i : i3) {
			System.out.print(i + " ");
		}

		System.out.println("\n");
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(10);
		list.addLast(20);
		list.add(30);
		list.add(1, 100);

		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println(list.contains(10));

		System.out.println("\n");
		list.removeFirst();
		list.removeLast();
		list.remove(); // removes the head of the list?????

		System.out.println(list.contains(2));
		System.out.println(list.indexOf(1));

	}
}
