package algorithm.lc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUniquePathsII {
	
	@Test
	public void testUniquePathsII() {
		UniquePathsII.Solution s = new UniquePathsII.Solution();	
		int[][] obstacle1 = {{0}, {0}};
		int exp1 = 1;
		assertEquals(exp1, s.uniquePathsWithObstacles(obstacle1));
	}
}
