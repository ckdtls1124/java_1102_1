package org.selfstudy.anonymousClass;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		
		Vector<String> v0=new Vector<String>();
		
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		for (String string : v0) {
			System.out.println(string);
		}
		System.out.println(" ");
		for (int i = 0; i < v0.size(); i++) {
			System.out.println(v0.get(i));
		}
		
//		IhateMyFuckingLifeSoTiringdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfffffff
		
		
		
	}
}
