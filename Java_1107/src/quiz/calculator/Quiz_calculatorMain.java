package quiz.calculator;


import java.util.Scanner;

public class Quiz_calculatorMain {
	public static void main(String[] args) {
		
//		Calculator를 생성한 후에 필드 num1, num2, operator를 초기화
//		메서드 sum, sub, multi, div, rem  생성
		Quiz_calculator cal=new Quiz_calculator();
		
//		cal.num1=40;
//		cal.num2=100;
//		cal.operator="*";
//		
//		if (cal.operator.equals("+")) {
//			cal.calSum();			
//		} 
//		else if(cal.operator.equals("-")) {
//			cal.calSub();
//		}
//		else if(cal.operator.equals("*")) {
//			cal.calMulti();
//		}
//		else if(cal.operator.equals("/")) {
//			cal.calDiv();
//		}
//		else if(cal.operator.equals("%")) {
//			cal.calRem();
//		}
//		else {
//			System.out.println("연산자 입력 오류");
//		}
		
//		============================================
		
//		Scanner inputOp=new Scanner(System.in);
//		
//		System.out.print("연산자를 입력:");
//		String oper=inputOp.next();
//		
//		inputOp.close();
//		
//		cal.num1=40;
//		cal.num2=100;
//		cal.operator=oper;
//		
//		if (cal.operator.equals("+")) {
//			cal.calSum();			
//		} 
//		else if(cal.operator.equals("-")) {
//			cal.calSub();
//		}
//		else if(cal.operator.equals("*")) {
//			cal.calMulti();
//		}
//		else if(cal.operator.equals("/")) {
//			cal.calDiv();
//		}
//		else if(cal.operator.equals("%")) {
//			cal.calRem();
//		}
//		else {
//			System.out.println("연산자 입력 오류");
//		}
		
//		===================================================
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자를 입력(취소 시 exit):");
			String oper=input.next();
			if(oper.equals("exit")) {
				System.out.println("계산기를 종료합니다.");
				break;
			}
			else {
				cal.operator=oper;
				System.out.print("첫번째 숫자입력:");
				int inputNum1=input.nextInt();
				cal.num1=inputNum1;
				System.out.print("두번째 숫자입력:");
				int inputNum2=input.nextInt();
				cal.num2=inputNum2;
				
				if (cal.operator.equals("+")) {
					cal.calSum();			
				} 
				else if(cal.operator.equals("-")) {
					cal.calSub();
				}
				else if(cal.operator.equals("*")) {
					cal.calMulti();
				}
				else if(cal.operator.equals("/")) {
					cal.calDiv();
				}
				else if(cal.operator.equals("%")) {
					cal.calRem();
				}
				else {
					System.out.println("연산자 입력 오류");
				}
				
			}
		}
	
		
		input.close();
			
		
		
		
		
	}
}
