package study.project;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		PascalTriangle pt = new PascalTriangle();
		ScreenReader number = new ScreenReader();
		System.out.println("Enter nubmber of row:");
		System.out.println(pt.getRow(number.readNumber()));
	}

}
