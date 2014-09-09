package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFindKthSmallestInSortedMatrix {

	@Test
 	public void testFindKthInSortedMatrix() {
		FindKthSmallestInSortedMatrix find = new FindKthSmallestInSortedMatrix();
		int[][] mat1 = {
			{1, 6, 6},
			{2, 7, 7},
			{2, 8, 9}
		};
		int k1 = 7;
		int e1 = 8;
		assertEquals(e1, find.findKth(mat1, 7));
		int k2 = 3;
		int e2 = 6;
		assertEquals(e2, find.findKth(mat1, k2));
		int[][] mat2 = {
			{1, 5, 9, 10},
			{1, 5, 9, 10}
		};
		int k3 = 3;
		int e3 = 5;
		assertEquals(e3, find.findKth(mat2, k3));
		int k4 = 7;
		int e4 = 10;
		assertEquals(e4, find.findKth(mat2, k4));
		int k5 = 6;
		int e5 = 10;
		assertEquals(e5, find.findKth(mat2, k5));
	} 
}
