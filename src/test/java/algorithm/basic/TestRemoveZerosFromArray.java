package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRemoveZerosFromArray {
	
	@Test
	public void testRemoveZerosFromArray() {
		RemoveZerosFromArray remove = new RemoveZerosFromArray();
		int[] arr = {1, 1, 0, 1, 0, 1, 0, 0, 1, 0};
		assertEquals(5, remove.removeZerosFromArray(arr));
		int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(8, remove.removeZerosFromArray(arr2));
		int[] arr3 = {};
		assertEquals(0, remove.removeZerosFromArray(arr3));
		int[] arr4 = {0, 0, 0, 0, 0, 0};
		assertEquals(0, remove.removeZerosFromArray(arr4));
		int[] arr5 = {1, 1, 1, 0, 0, 0};
		assertEquals(3, remove.removeZerosFromArray(arr5));
	}
}
