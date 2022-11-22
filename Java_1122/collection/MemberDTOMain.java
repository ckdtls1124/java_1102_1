package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class MemberDTOMain {
	public static void main(String[] args) {

		Vector<MemberDTO> member = new Vector<MemberDTO>();
		member.add(new MemberDTO("charlie1124", "shin1124", "Charlie", 26));
		member.add(new MemberDTO("Minji1234", "Minji4454", "Minji", 24));
		member.add(new MemberDTO("Adam", "adam112321", "Adam Smith", 52));
		

		for (MemberDTO memberDTO : member) {
			System.out.println(memberDTO.getUserId());
			System.out.println(memberDTO.getUserPw());
			System.out.println(memberDTO.getUserName());
			System.out.println(memberDTO.getAge());
		}
		
		System.out.println(" ");

		Iterator<MemberDTO> a = member.iterator();
		while (a.hasNext()) {
			MemberDTO b=a.next(); //한번만 사용하기
			System.out.println(b.getUserId()+b.getUserName()+b.getUserPw()+b.getAge());
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < member.size(); i++) {
			MemberDTO c=member.get(i);
			System.out.println(c.getUserName());
			System.out.println(c.getUserId());
			System.out.println(c.getUserPw());
			System.out.println(c.getAge());
			
		}
		
		
	}
}
