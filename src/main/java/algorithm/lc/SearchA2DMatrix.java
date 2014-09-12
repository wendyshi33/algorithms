package algorithm.lc;

public class SearchA2DMatrix {
	public static class Solution {
		public boolean searchMatrix(int[][] matrix, int target) {
			int m = matrix.length;
			if (m == 0) {
				return false;
			}      
			int n = matrix[0].length;
			if (n == 0) {
				return false;
			}
			int r = 0;
			int c = n - 1;
			while (r < m && c >= 0) {
				if (matrix[r][c] == target) {
					return true;
				} else if (matrix[r][c] < target) {
					--c;
				} else {
					++r;
				}
			}
			return false;
		}
	}
}
