package selfstudy_myOwnDictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class WordCards {
	public static void main(String[] args) {

//		Put the data in console

		InputStreamReader input = null;
		Map<String, String> wordCards = new HashMap<String, String>();
		try {
			while (true) {
				input = new InputStreamReader(System.in);
//			Ask for an approve of starting this application
				System.out.print("Would you like to make some word cards?: ");
				BufferedReader approve = new BufferedReader(input);
				String approval = approve.readLine();
				if (approval.equals("No") || approval.equals("no")) {
					break;
				} else if(approval.equals("Yes") || approval.equals("yes")) {
//			Type in the words
					System.out.print("Type in your word: ");

//		Assign "input" to BufferedReader type object "inputWords"
					BufferedReader inputWords = new BufferedReader(input);
					String word = inputWords.readLine();

//			Type in the meaning of each word
					System.out.print("Type in the meaning of each word:");

//			Assign "input" to BufferedReader type object "inputWords"
					BufferedReader inputMeanings = new BufferedReader(input);
					String meaning = inputMeanings.readLine();
					wordCards.put(word, meaning);
				} else {
					System.out.println("======Typed incorrect. Please type again======");
				}
			}
			Set<String> keys=wordCards.keySet();
			Iterator<String> keysIter=keys.iterator();	
			while (keysIter.hasNext()) {
				String values=keysIter.next();
				String value=wordCards.get(values);
				System.out.println(values+":"+value);
				System.out.println("======Show byte of meaning======");
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}
}
