package org.study.Contoller;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Vector;

import org.study.DTO.MemberDTO;

public class MemberController {
	public static void main(String[] args) {
		
		
		ArrayList<MemberDTO> member=new ArrayList<MemberDTO>();
		
//		Initialising 5 elements, no userId overlapping
		
		member.add(new MemberDTO("ckdtls1123", "shin11231", "changshinKang@naver.com", 26));
		member.add(new MemberDTO("pinokio", "tmfql1125", "Seulbi@naver.com", 25));
		member.add(new MemberDTO("sujinida", "tnwls0315", "Sujin@naver.com", 20));
		member.add(new MemberDTO("gwajessival", "Gwajessival!", "Jewoo@naver.com", 26));
		member.add(new MemberDTO("dgh3761", "188MPhooah!", "Jaewook@naver.com", 27));
		
//		use for each and iterator
		for (MemberDTO memberDTO : member) {
			System.out.println("Id: "+memberDTO.getUserId());
			System.out.println("Pw: "+memberDTO.getUserPw());
			System.out.println("Email: "+memberDTO.getEmail());
			System.out.println("Age: "+memberDTO.getAge());
		}
		
		System.out.println(" ");
		Iterator<MemberDTO> member1=member.iterator();
		while (member1.hasNext()) {
			MemberDTO memberDTO=member1.next();
			System.out.println("Id: "+memberDTO.getUserId());
			System.out.println("Pw: "+memberDTO.getUserPw());
			System.out.println("Email: "+memberDTO.getEmail());
			System.out.println("Age: "+memberDTO.getAge());
		}
		
		member.add(new MemberDTO("dfsaf", "Password", "affa@naver.com", 45));
		System.out.println(member.get(5).getUserId());
		System.out.println(member.get(5).getUserPw());
		System.out.println(member.get(5).getEmail());
		System.out.println(member.get(5).getAge());
		
		
		
	}
}
