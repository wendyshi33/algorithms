package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestSubarraySum {

	@Test
	public void testSubarraySum() {
		SubarraySum subsum = new SubarraySum();
		int[] arr = {8, 6, 4, -3, 1, -5, 6, 1, 2};

		int[] expected1 = {6, 4, -3};
		int[] res1 = subsum.subsum(arr, 7);
		assertArrayEquals(expected1, res1);

		int[] expected2 = {-3, 1, -5, 6, 1};
		int[] res2 = subsum.subsum(arr, 0);
		assertArrayEquals(expected2, res2);

		int[] expected3 = {};
		int[] res3 = subsum.subsum(arr, 100);
		assertArrayEquals(expected3, res3);
	}
}
