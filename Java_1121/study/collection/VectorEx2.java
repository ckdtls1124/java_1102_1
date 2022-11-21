package org.study.collection;

import java.util.Iterator;
//import java.util.Vector.Iterator;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {

		Vector<MemberDTO> register = new Vector<MemberDTO>();
		register.add(new MemberDTO("Charlie", "Charlie1235", "Charlie", 25));
		register.add(new MemberDTO("Seulbi", "Seulbi1235", "Seulbi", 24));

		System.out.println();

		for (int i = 0; i < register.size(); i++) {

			System.out.println("아이디: " + register.get(i).getUserId() + " " + "비밀번호: " + register.get(i).getUserPw()
					+ " " + "이름: " + register.get(i).getUserName() + " " + "나이: " + register.get(i).getAge());

		}
		System.out.println(" ");
		for (MemberDTO memberDTO : register) {
			System.out.println("아이디: " + memberDTO.getUserId() + " " + "비밀번호: " + memberDTO.getUserPw() + " " + "이름: "
					+ memberDTO.getUserName() + " " + "나이: " + memberDTO.getAge());
		}

		System.out.println(" ");
		Iterator<MemberDTO> memberInfo = register.iterator();
		while (memberInfo.hasNext()) {
			MemberDTO a = memberInfo.next();
			System.out.println("아이디: " + a.getUserId() + " " + "비밀번호: " + a.getUserPw() + " " + "이름: "
					+ a.getUserName() + " " + "나이: " + a.getAge());
		}

	}
}
