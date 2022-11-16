package vendingmachine_controller;

import java.util.Scanner;

import vendingmachine_calculate.CalculateMoney;
import vendingmachine_command.ExecuteCalculation;
import vendingmachine_productGiveOut.ProductGiveout;

public class ShowResult { 

	public static int Money=0;
	public static String Choice;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		while(true) {
			System.out.print("Put the money in: ");
			int inputMoney=input.nextInt();
			ShowResult.Money=ShowResult.Money+inputMoney;
			
			if(MoneyInput.checkMinimumInput()) {
				System.out.println("What would you like to drink?"
						+"\n"+"Press the number"
						+"\n"+"1.Coke 2.Dr.Pepper 3.Sprite"
						+"\n"+"1.5000 2.4500 3.4700");
				String choice=input.next();
				ShowResult.Choice=choice;				

				if(MoneyInput.checkPriceInput(ShowResult.Money)==1 || MoneyInput.checkPriceInput(ShowResult.Money)==2) {
					System.out.println("Not enough money.");
				}
				else {
					break;					
				}
			}
		}


		input.close();

//		Calculate
		//		check the money
		System.out.println("=====");
		ExecuteCalculation guideMessage=new MoneyInput();
		guideMessage.executeCal();
		System.out.println("=====");
		//		Balance show
		ExecuteCalculation balanceShow=new CalculateMoney();
		balanceShow.executeCal();
		
//		View
		//		Product give out
		ExecuteCalculation giveoutProduct=new ProductGiveout();
		giveoutProduct.executeCal();
		System.out.println("=====");
		//			Give the balance
		ExecuteCalculation balanceGive=new MoneyOutput();
		balanceGive.executeCal();

	}
}