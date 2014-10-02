class Solution:
  # @param matrix, a list of lists of 1 length string
  # @return an integer
  def maximalRectangle(self, matrix):
    row = len(matrix)
    if row == 0:
      return 0
    col = len(matrix[0])
    
    continuous_ones = [[0 for c in range(col)] for r in range(row)]     
    max_area = 0
    
    for r in range(row):
      for c in range(col):
        if matrix[r][c] == '1':
          if c == 0:
            continuous_ones[r][c] = 1
          else:
            continuous_ones[r][c] = continuous_ones[r][c - 1] + 1
            
          min_width = continuous_ones[r][c]
          cur_height = r
          while cur_height >= 0:
            if continuous_ones[r][c] == '0':
              break
            min_width = min(min_width, continuous_ones[cur_height][c])
            area = (r - cur_height + 1) * min_width
            max_area = max(max_area, area)
            cur_height -= 1
            
    return max_area
