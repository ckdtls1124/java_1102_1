package org.selfstudy.iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	
	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		
		Iterator<String> iter=v1.iterator();
		
		while (iter.hasNext()){
			String str=iter.next();
			System.out.println(str);
		}
		
	}
	
}
