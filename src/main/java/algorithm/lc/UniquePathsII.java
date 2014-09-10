package algorithm.lc;

public class UniquePathsII {
	public static class Solution {
		public int uniquePathsWithObstacles(int[][] obstacleGrid) {
			int m = obstacleGrid.length;
			if (m == 0) {
				return 0;
			}
			int n = obstacleGrid[0].length;
			if (n == 0) {
				return 0;
			}
			int[][] mat = new int[m][n];
			for (int r = 0; r < m; ++r) {
				for (int c = 0; c < n; ++c) {
					if (r == 0 && c == 0) {
						mat[r][c] = obstacleGrid[r][c] == 0? 1 : 0;
					} else if (r == 0) {
						mat[r][c] = obstacleGrid[r][c] == 0? mat[r][c - 1] : 0;
					} else if (c == 0) {
						mat[r][c] = obstacleGrid[r][c] == 0? mat[r - 1][c] : 0;
					} else {
						mat[r][c] = obstacleGrid[r][c] == 0? mat[r - 1][c] + mat[r][c - 1] : 0;
					}
				}
			}
			return mat[m - 1][n - 1];
		}
	}
}
