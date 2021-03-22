package study.project;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	private List<Integer> buildPascalTriangel (int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i <= n; i++) {
			list.add(i, new ArrayList<>());
			int k = 1;
			list.get(i).add(1);
			for (int j = 1; j < i; j++) {
				try {
					k = k * ((i) - (j)) / (j);
					list.get(i).add(k);
				} catch (Exception e) {
				}
			}

		}
		return list.get(n);
	}
	
	public List<Integer> getRow (int n) {
		List <Integer> list = buildPascalTriangel(n);
		return list;
	}
}
