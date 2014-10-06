package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMaxDistanceInArray {

	@Test
	public void testMaxDistanceInArray() {
		MaxDistanceInArray maxDist = new MaxDistanceInArray();
		int[] arr1 = {1, 5, 2, 6, 8, 2, 1};
		assertEquals(16, maxDist.maxDistanceInArray(arr1));
		int[] arr2 = {6, 2, 1, 6, 8, 9, 1, 2, 3, 6, 1};
		assertEquals(21, maxDist.maxDistanceInArray(arr2));
		int[] arr3 = {};
		assertEquals(0, maxDist.maxDistanceInArray(arr3));
	}
}
