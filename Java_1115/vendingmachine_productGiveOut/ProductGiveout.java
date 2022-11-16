package vendingmachine_productGiveOut;

import vendingmachine_command.ExecuteCalculation;
import vendingmachine_controller.ShowResult;

public class ProductGiveout implements ExecuteCalculation{
	
	String product=null;
	
	@Override
	public void executeCal() {
		// TODO Auto-generated method stub
		if(ShowResult.Choice.equals("1")){
			product="Coke";
		}
		else if(ShowResult.Choice.equals("2")){
			product="Dr.Pepper";
		}
		else if(ShowResult.Choice.equals("3")){
			product="Sprite";
		}
		System.out.println("The product is "+product);

	}
	
}