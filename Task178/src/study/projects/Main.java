package study.projects;

import java.util.ArrayList;
import java.util.List;

public class Main {
		
	public static void main(String[] args) {
		
		Calc c = new Calc();
		ScreenReader r = new ScreenReader();
		List <Double> list = new ArrayList <Double>();
		
		try {
			list = r.readNumbers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Double value: list) {
			System.out.println("List: " + value);
		}

		System.out.println("Option g:");
		c.printResult(c.calc1(list));
		
		System.out.println("Option d:");
		c.printResult(c.calc2(list));
		
	}
}
