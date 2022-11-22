package org.study.Contoller;

import java.util.ArrayList;
import java.util.Scanner;
import org.study.DTO.MemberDTO;

public class MemberController2_Scanner3 {
	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("m1", "11", "m1@gmail.com", 11));
		
		String userId=list.get(0).getUserId();
		String userPw=list.get(0).getUserPw();
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Type in your ID(if you are not registered yet, please register first: ");
		String idInput=input.next();
		
		System.out.println("Type in your PW: ");
		String pwInput=input.next();
		
		if (userId.equals(idInput)) {
			if(userPw.equals(pwInput)) {
				System.out.println("Login success.");
			} else {
				System.out.println("You typed wrong password.");
			}
			
		} else {
			System.out.println("Please type the ID correctly.");
		}
		
		
	}
}
