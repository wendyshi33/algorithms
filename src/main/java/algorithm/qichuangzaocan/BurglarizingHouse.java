package algorithm.airbnb;

import java.util.*;

/**
 *	A thief wants to steal money from the whole street, but he cannot steal two
 *	consecutive houses as the house owners will immediately notify their neighbors.
 *	Given the amount of money in each house, how can the thief maximize his swag?
 *
 *	Time complexity O(N), space Complexity O(N).
 *
 */
public class BurglarizingHouse {

	public int bestValueRecursive(int[] houses) {
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
			values[n] = Math.max(best(houses, values, n - 1), best(houses, values, n - 2) + houses[n]);
			return values[n];
		} 
	}

	public int bestValue(int[] houses) {
		int[] values = new int[houses.length];      
		values[0] = houses[0];
		if (houses.length >= 2) {
			values[1] = Math.max(values[0], houses[1]);
		}
		for (int i = 2; i < houses.length; ++i) {
			values[i] = Math.max(values[i - 2] + houses[i], values[i - 1]);
		}
		return values[houses.length - 1];
	}

}
