package vendingmachine_controller;

import vendingmachine_command.ExecuteCalculation;

public class MoneyInput implements ExecuteCalculation{
	
	public static boolean bool1=false;
	public static int checkPrice;
	
	@Override
	public void executeCal() {
		// TODO Auto-generated method stub
		System.out.println("Please Wait a moment.");
	}
	
	public static boolean checkMinimumInput() {
		if(ShowResult.Money>=4500) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static int checkPriceInput(int a) {
		if(ShowResult.Choice.equals("1") && a<5000) {
			return checkPrice=1;
		}
		else if(ShowResult.Choice.equals("3") && 4500<=a && a<4700) {
			return checkPrice=2;
		}
		return 0;
		
	}
	
	
	
}