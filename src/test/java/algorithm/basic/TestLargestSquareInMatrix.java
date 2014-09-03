package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLargestSquareInMatrix {
	
	@Test
	public void testLargestSquareInMatrix() {
		LargestSquareInMatrix largest = new LargestSquareInMatrix();
		int[][] mat1 = {
			{1, 0, 1, 1, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 1},
			{0, 1, 0, 1, 1, 1, 1, 0},
			{0, 1, 0, 1, 1, 1, 1, 1},
			{0, 0, 0, 1, 1, 1, 1, 0}
		};
		assertEquals(4, largest.largestSquareInMatrix(mat1));

		int[][] mat2 = {
			{1, 0, 1, 1, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 1},
			{0, 1, 0, 0, 1, 1, 1, 0},
			{0, 1, 0, 1, 1, 1, 1, 1},
			{0, 0, 0, 1, 1, 1, 1, 0}
		};
		assertEquals(3, largest.largestSquareInMatrix(mat2));

		int[][] mat3 = {
			{1, 0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 1, 1},
			{0, 1, 0, 0, 1, 1, 1, 0},
			{0, 1, 0, 1, 1, 1, 1, 1},
			{0, 0, 0, 1, 1, 1, 1, 0}
		};
		assertEquals(5, largest.largestSquareInMatrix(mat3));
	}
}
