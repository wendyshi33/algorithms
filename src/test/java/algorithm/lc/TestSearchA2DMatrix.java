package algorithm.lc;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestSearchA2DMatrix {
	
	@Test
	public void testSearchA2DMatrix() {
		SearchA2DMatrix.Solution search = new SearchA2DMatrix.Solution();
		int[][] mat1 = {{1}};	
		int target1 = 1;
		assertTrue(search.searchMatrix(mat1, target1));
	}

}
