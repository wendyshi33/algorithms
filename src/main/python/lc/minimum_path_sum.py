class Solution:
  # @param grid, a list of lists of integers
  # @return an integer
  def minPathSum(self, grid):
    m = len(grid)
    if m == 0:
      return 0
    n = len(grid[0])
    if n == 0:
      return 0
    res = [[0 for c in range(n)] for r in range(m)]     
    for r in range(m):
      for c in range(n):
        if r == 0 and c == 0:
          res[r][c] = grid[r][c]
        elif r == 0:
          res[r][c] = res[r][c - 1] + grid[r][c]
        elif c == 0:
          res[r][c] = res[r - 1][c] + grid[r][c]
        else:
          res[r][c] = min(res[r][c - 1], res[r - 1][c]) + grid[r][c]
    return res[m - 1][n - 1]
