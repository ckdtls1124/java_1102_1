package org.study.collection;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {

		Vector<Integer> v0 = new Vector<Integer>();

		v0.add(new Integer(1000));
		v0.add(1001);
		v0.add(1002);
		v0.add(1003);
		v0.add(1004);

		System.out.println("Size: " + v0.size());
		for (int v01 : v0) { // 자동 언박싱
			System.out.println(v01);
		}

		Vector<Integer> a = new Vector<Integer>(Arrays.asList(4, 5, 3));
		a.add(0, 2);
		a.add(4444);
		a.add(1, 342); // index를 미리 설정하고 값을 부여 가능
		System.out.println(a); // 이렇게 출력 가능
		
		System.out.println(a.elementAt(2));
		
		
		
	}
}
