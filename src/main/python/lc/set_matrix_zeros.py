class Solution:
  # @param matrix, a list of lists of integers
  # RETURN NOTHING, MODIFY matrix IN PLACE.
  def setZeroes(self, matrix):
    if len(matrix) == 0 or len(matrix[0]) == 0:
      return
      
    col_zero = False
    for r in range(len(matrix)):
      if matrix[r][0] == 0:
        col_zero = True
      
    if 0 in matrix[0]:
      matrix[0][0] = 0
      
    for r in range(1, len(matrix)):
      for c in range(1, len(matrix[0])): 
        if matrix[r][c] == 0:
          matrix[r][0] = matrix[0][c] = 0
    
    for r in range(1, len(matrix)):
      for c in range(1, len(matrix[0])):
        if matrix[r][0] == 0 or matrix[0][c] == 0:
          matrix[r][c] = 0
    
    if matrix[0][0] == 0:
      matrix[0] = [0] * len(matrix[0])
    
    if col_zero:
      for r in range(len(matrix)):
        matrix[r][0] = 0
