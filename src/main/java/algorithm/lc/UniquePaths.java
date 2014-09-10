public class Solution {
  public int uniquePaths(int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }
    int[][] mat = new int[m][n];
    for (int r = 0; r < m; ++r) {
      for (int c = 0; c < n; ++c) {
        if (r == 0 || c == 0) {
          mat[r][c] = 1;
        } else {
          mat[r][c] = mat[r - 1][c] + mat[r][c - 1];
        }
      }
    }
    return mat[m - 1][n - 1];
  }
}
