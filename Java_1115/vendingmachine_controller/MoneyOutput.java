package vendingmachine_controller;

import vendingmachine_calculate.CalculateMoney;
import vendingmachine_command.ExecuteCalculation;

public class MoneyOutput implements ExecuteCalculation{
	
	@Override
	public void executeCal() {
		System.out.println("Here you go: "+CalculateMoney.balance);
	}
}