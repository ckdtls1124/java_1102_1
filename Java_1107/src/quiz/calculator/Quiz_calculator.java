package quiz.calculator;

public class Quiz_calculator {
	public int num1;
	public int num2;
	public String operator;
	
	public static final String PROJECTNAME="Calculator";
//	define the variables
	
	
//	methods
	public void calSum() {
		int result=num1+num2;			
		System.out.println(num1+"+"+num2+"="+(result));
	}
	public void calSub() {
		int result=num1-num2;			
		System.out.println(num1+"-"+num2+"="+(result));		
	}
	public void calMulti() {
		int result=num1*num2;			
		System.out.println(num1+"*"+num2+"="+(result));		
	}
	public void calDiv() {
		double result=(double)num1/num2;			
		System.out.println(num1+"/"+num2+"="+(result));
	}
	public void calRem() {
		int result=num1%num2;			
		System.out.println(num1+"%"+num2+"="+(result));
	}
	
}
