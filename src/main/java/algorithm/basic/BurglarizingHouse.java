package algorithm.basic;

import java.util.*;

public class BurglarizingHouse {
	
	public int bestValue(int[] houses) {
		int[] values = new int[houses.length];		
		Arrays.fill(values, -1);
		
		return best(houses, values, houses.length - 1);
	}

	private int best(int[] houses, int[] values, int n) {
		if (n <= 0) {
			return 0;
		} else if (values[n] != -1) {
			return values[n];
		} else {
			values[n] = Math.max(best(houses, values, n - 1), 
									best(houses, values, n - 2) + houses[n]);
			return values[n];
		} 
	}

}
