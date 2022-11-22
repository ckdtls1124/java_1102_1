package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<String, String>();

		map1.put("가수1", "이모모");
		map1.put("가수1", "Brandon");
		map1.put("가수2", "강모모");
		map1.put("가수3", "박모모");
		map1.put("가수4", "최모모");
		map1.put("가수5", "정모모");
		map1.put("가수6", "조모모");
		map1.put("가수7", "문모모");

		System.out.println(map1);
		System.out.println(map1.get("가수5"));
		
		System.out.println( );
		// How to print out

		// 1. use keySet() method
		Set<String> set = map1.keySet();
		System.out.println(set);
		
		System.out.println( );
		// 2. use iterator to take the values out
		Iterator<String> key = set.iterator();
		while (key.hasNext()) {
			String key1 = key.next();
			String data = map1.get(key1);
			System.out.println("Key: "+key1+" Value: "+data);

		}
	}
}
