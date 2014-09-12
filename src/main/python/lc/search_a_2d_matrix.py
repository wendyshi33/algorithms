class Solution:
  # @param matrix, a list of lists of integers
  # @param target, an integer
  # @return a boolean
  def searchMatrix(self, matrix, target):
    m = len(matrix)
    if m == 0:
      return False
    n = len(matrix[0])
    if n == 0:
      return False
    r = 0
    c = n - 1
    while r < m and c >= 0:
      if matrix[r][c] == target:
        return True
      elif matrix[r][c] < target:
        r += 1
      else:
        c -= 1
    return False     
