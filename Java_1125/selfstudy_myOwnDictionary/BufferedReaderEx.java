package selfstudy_myOwnDictionary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader numberInput=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter numberOutput=new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("Type in the numbers of loop you want to do: ");
		String loopnumber=numberInput.readLine();
//		Change it to number
		int loop=Integer.parseInt(loopnumber);
		
		StringTokenizer toKenizer;
		for (int i = 0; i < loop; i++) {
			System.out.print("Type in two numbers: ");
			toKenizer=new StringTokenizer(numberInput.readLine(), ",");
			numberOutput.write("The sum of the numbers that you typed in= "+(Integer.parseInt(toKenizer.nextToken())+Integer.parseInt(toKenizer.nextToken())+"\n"));
			
		}
		numberOutput.close();
		
		
		
		
	}


}
