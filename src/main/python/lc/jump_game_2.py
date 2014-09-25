class Solution:
  # @param A, a list of integers
  # @return an integer
  def jump(self, A):
    step = 0
    end = len(A) - 1
    while end > 0:
      for pos in range(end):
        if pos + A[pos] >= end:
          end = pos
          step += 1
          
    return step      
