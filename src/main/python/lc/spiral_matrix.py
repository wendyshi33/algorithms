class Solution:
  # @param matrix, a list of lists of integers
  # @return a list of integers
  def spiralOrder(self, matrix):
    if len(matrix) == 0:
      return []
    res = []
    m, n = len(matrix), len(matrix[0])
    max_level = (min(len(matrix), len(matrix[0])) + 1) / 2      
    
    for level in range(max_level):
      # upper
      for c in range(level, n - level):
        res.append(matrix[level][c])
      # right
      for r in range(level + 1, m - level):
        res.append(matrix[r][n - level - 1])
      # bottom
      if 2 * level < m - 1:
        for c in range(n - 2 - level, level - 1, -1):
          res.append(matrix[m - level - 1][c])
      # left
      if 2 * level < n - 1:
        for r in range(m - 2 - level, level, -1):
          res.append(matrix[r][level])
    
    return res
