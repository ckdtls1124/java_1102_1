package selfstudy_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Map<String, String> hashmapList = new HashMap<String, String>();

		while (true) {
			System.out.print("Would you like to make word card for yourself?: ");
			String answer = scan.next();
			if (answer.toString().equals("No") || answer.toString().equals("no")) {
				break;
			} else {
				System.out.print("Write down german word: ");
				String word = scan.next();
				System.out.print("Write down the meaning of the word: ");
				String[] meaning = input.readLine().split(" ");
				String meaning1=meaning.toString();
				hashmapList.put(word, meaning1);
			}
		}
		System.out.println();
		System.out.println("Let me show you your words in random order.");
		Set<String> key = hashmapList.keySet();
		Iterator<String> keys = key.iterator();
		while (keys.hasNext()) {
			String key1 = keys.next(); // "keys" is having the referencing address of data.
			// it needs to be boxed into wrapper class.
			String value = hashmapList.get(key1);
			System.out.println(key1 + " : " + value);
		}

	}

}
