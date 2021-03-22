package study.projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ScreenReader {

	public List<Double> readNumbers() throws NumberFormatException, IOException, Exception {
		List<Double> list = new ArrayList<Double>();

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		do {
			if (Integer.valueOf(read.readLine()) <= 0)
				throw new Exception();
			try {
				list.add(Double.parseDouble(read.readLine()));
			} catch (NumberFormatException e) {
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (read.readLine().equals("`"));

		return list;
	}
}
