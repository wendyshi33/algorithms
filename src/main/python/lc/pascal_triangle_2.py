class Solution:
  # @return a list of integers
  def getRow(self, rowIndex):
    res = [0] * (rowIndex + 1)
    res[0] = 1
    for row in range(1, rowIndex + 1):
      left, right = res[0], res[1]
      for col in range(1, row):
        res[col] = left + right
        left, right = right, res[col + 1]
      res[row] = 1
    return res          
