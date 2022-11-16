package vendingmachine_calculate;

import vendingmachine_command.ExecuteCalculation;
import vendingmachine_controller.ShowResult;

public class CalculateMoney implements ExecuteCalculation {

	public static int balance = 0;

	@Override
	public void executeCal() {
		if (ShowResult.Choice.equals("1")) {
			balance = ShowResult.Money - 5000;
		} else if (ShowResult.Choice.equals("2")) {
			balance = ShowResult.Money - 4500;
		} else if (ShowResult.Choice.equals("3")) {
			balance = ShowResult.Money - 4700;
		}
		System.out.println("The balance is " + balance);
	}
}