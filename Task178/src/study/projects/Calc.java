package study.projects;

import java.util.ArrayList;
import java.util.List;

public class Calc {

	public List<Double> calc1(List<Double> list) {
		List<Double> calculatedList = new ArrayList<Double>();
		for (int i = 1; i <= list.size() - 2; i++) {
			if (list.get(i) < (list.get(i - 1) + list.get(i + 1)) / 2) {
				calculatedList.add(list.get(i));
			}
		}
		return calculatedList;
	}

	public List<Double> calc2(List<Double> list) {
		List<Double> calculatedList = new ArrayList<Double>();
		for (int i = 1; i <= list.size() - 1; i++) {
			if (powerOfTwo(i + 1) < list.get(i) & list.get(i) < factorial(i + 1)) {
				calculatedList.add(list.get(i));
			}
		}
		return calculatedList;
	}

	public int powerOfTwo(int ordinalNumber) {
		return (int) Math.ceil(Math.exp(ordinalNumber * Math.log(2)));
	}

	public int factorial(int ordinalNumber) {
		int x = 1;
		for (int i = 1; i <= ordinalNumber; i++) {
			x = x * i;
		}
		return x;
	}

	public void printResult(List<Double> list) {
		for (Double value : list) {
			System.out.println(value);
		}
	}

}
