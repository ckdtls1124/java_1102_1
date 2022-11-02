package org.study.loopEx;

//import java.util.Scanner;

public class ForEx03_making_html {
	public static void main(String[] args) {
	
		System.out.println("for 문-html 코드 작성하기");
		
//		해당 코드는 html에서 div태그에 속한 ul태그 속 li태그 10개를 출력하는 것이다.
//		각 li태그에는 img가 첨부되어 있다.
		
		String div="<div>\n <ul>\n";
		
		for (int i=0;i<10;i++) {
			div=div+"  <li><img src='img/bg_"+i+".jpg'></li>\n";
		}
		
		div = div+" </ul>\n</div>";
		
		System.out.println(div);
	
	}
}
