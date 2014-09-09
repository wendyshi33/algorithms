class Solution:
  # @return a list of lists of integer
  def generateMatrix(self, n):
    m = [[0] * n for i in range(n)]
    cur = 0
    max_level = (n + 1) / 2
    for level in range(max_level):
      # fill upper
      for c in range(level, n - level):
        cur += 1
        m[level][c] = cur      
      # fill right
      for r in range(level + 1, n - level):
        cur += 1
        m[r][n - level - 1] = cur
      # fill bottom
      if 2 * level < n + 1:
        for c in range(n - level - 2, level - 1, -1):
          cur += 1
          m[n - level - 1][c] = cur
        for r in range(n - level - 2, level, -1):
          cur += 1
          m[r][level] = cur
    return m
