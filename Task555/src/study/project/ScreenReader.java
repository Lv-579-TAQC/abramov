package study.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScreenReader {

	BufferedReader lineNumber = new BufferedReader(new InputStreamReader(System.in));
	
	public int readNumber () {
		int number = 0;
		try {
			number = Integer.parseInt(lineNumber.readLine());
			} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return number;
		
		}
}
