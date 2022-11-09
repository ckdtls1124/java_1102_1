package humanBodyMaking;

import java.util.Scanner;

import humanBodyMaking.Skin;

public class IntroduceMySelf {
	public static void main(String[] args) {
		System.out.println("I would like to introduce myself.");

		System.out.println("My hair is ...");
		Hair changshinHair=new Hair("black", "pretty much curly", 15);
		changshinHair.showMyHairColor();
		changshinHair.showMyHairStyle();
		changshinHair.showMyHairLength();

		System.out.println(" ");
		System.out.println("My skin is ...");
		Skin changshinSkin=new Skin("white", "relatively soft", "no freckles");
		changshinSkin.showTheSkinColor();
		changshinSkin.showTheSkinToughness();
		changshinSkin.showTheSkinFreckled();

		System.out.println(" ");
		//		check the user to know whether they are my friend or not

		Scanner check=new Scanner(System.in);

		Skin changshinDots=new Skin(17);
		int myDotsAre=changshinDots.getDots();

		while (true) {
			System.out.print("Are we friends?:");
			String ask=check.next();
			if(ask.equals("no") || ask.equals("No")) {
				System.out.println("I'm sorry to hear that.\nI hope we can be friends in the future");
				break;
			}
			else if(ask.equals("Yes") || ask.equals("yes")){
				System.out.println("Oh we are friends.\nThen, I have to ask, how many dots do I have?");
				System.out.print("Type here the number:");
				int DotsCount=check.nextInt();


				if (myDotsAre==DotsCount) {
					System.out.println("You know me fairly well");
				} else {
					System.out.println("Who the fuck are you?");
				}
				break;
			}
		}
		check.close();

	}
}

