class Solution:
  # @param s, an input string
  # @param p, a pattern string
  # @return a boolean
  def isMatch(self, s, p):
    row, col = len(s), len(p)
    match = [[0 for c in range(col + 1)] for r in range(row + 1)]      
    match[0][0] = True
    for c in range(1, col + 1):
      match[0][c] = False if p[c - 1] != '*' else match[0][c - 1]
      
    for r in range(1, row + 1):
      for c in range(1, col + 1):
        if p[c - 1] == '*':
          match[r][c] = match[r - 1][c - 1] or match[r][c - 1]
        else:
          match[r][c] = match[r - 1][c - 1] and True if p[c - 1] == s[r - 1] or p[c - 1] == '?' else False
    
    return match[row][col]
