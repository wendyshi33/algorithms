class Solution:
  # @param obstacleGrid, a list of lists of integers
  # @return an integer
  def uniquePathsWithObstacles(self, obstacleGrid):
    m = len(obstacleGrid)
    if m == 0:
      return 0
    n = len(obstacleGrid[0])
    mat = [[0 for i in range(n)] for j in range(m)]
    for r in range(m):
      for c in range(n):
        if r == 0 and c == 0:
          mat[r][c] = 1 if obstacleGrid[r][c] == 0 else 0
        elif r == 0:
          mat[r][c] = 1 if obstacleGrid[r][c - 1] == 0 else 0
        elif c == 0:
          mat[r][c] = 1 if obstacleGrid[r - 1][c] == 0 else 0
        elif obstacleGrid[r][c] == 1:
          mat[r][c] = 0
        else:
          mat[r][c] = mat[r - 1][c] + mat[r][c - 1]
          
    return mat[m - 1][n - 1]
