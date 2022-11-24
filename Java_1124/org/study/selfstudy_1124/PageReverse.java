package org.study.selfstudy_1124;

import java.util.Scanner;
import java.util.Stack;

public class PageReverse {
	public static void main(String[] args) {
		
//		Type in the application name == I clicked the application and I'm using it or I used it.
//		Make to input of "go back" and "go forward"
//		if there is pages that I've already been, I can "go back" to that page, but the otherwise, it can't
		
		Scanner input=new Scanner(System.in);
		Stack<BackwardStack> pagesBack=new Stack<BackwardStack>();
		Stack<ForwardStack> pagesForth=new Stack<ForwardStack>();
		
		
		while (true) {
			System.out.print("Which application are you going?: ");
			String search=input.next();
			
			
//		Stack the pages that I've been
			if (search.equals("Exit") || search.equals("exit")) {
				break;
			} else if(search.contains("www.")) {
				if (search.contains(".com")) {
					System.out.println("Opening "+search+" page right now.");
					
				} else {
					System.out.println("The address is not correct.\nType in again");
				}
			} else {
				System.out.println("The address is not correct.\\nType in again");
			}
			
		}
//		Go back to previous page
		
		
		
//		Go forward
		
		
		
		
		
		
//		Execute "go back" or "go forward"
		System.out.print("Where would you like to go?");
		String searchPage=input.next();
		while (true) {
			if (searchPage.equals("Goback") || searchPage.equals("Go back") || searchPage.equals("go back")) {
				
			} else {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
