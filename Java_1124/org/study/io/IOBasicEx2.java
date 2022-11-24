package org.study.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOBasicEx2 {
	public static void main(String[] args) {

		System.out.print("Type in: ");
		InputStreamReader inReader = new InputStreamReader(System.in);

		while (true) {
			try {
				int inData = inReader.read();
				char charData = (char) inData;
				System.out.println(charData);
				if (inData == -1) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			inReader.close();
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}

		//		to stop it, type -1 and type "ctrl+z"
	}
}
