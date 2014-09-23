class Solution:
  # @return an integer
  def numDistinct(self, S, T):
    row, col = len(T), len(S)
    res = [[0 for c in range(col + 1)] for r in range(row + 1)]
    
    for r in range(row + 1):
      for c in range(r, col + 1):
        if r == 0 and c == 0:
          res[r][c] = 1
        elif r == 0:
          res[r][c] = res[r][c - 1]
        else:
          res[r][c] = res[r][c - 1]
          if T[r - 1] == S[c - 1]:
            res[r][c] += res[r - 1][c - 1]
    
    return res[row][col]      
