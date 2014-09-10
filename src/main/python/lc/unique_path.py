class Solution:
  # @return an integer
  def uniquePaths(self, m, n):
    mat = [[0 for i in range(n)] for j in range(m)]
    for r in range(m):
      for c in range(n):
        if r == 0 or c == 0:
          mat[r][c] = 1
        else:
          mat[r][c] = mat[r - 1][c] + mat[r][c - 1]
    return mat[m - 1][n - 1]      
