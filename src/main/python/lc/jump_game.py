class Solution:
  # @param A, a list of integers
  # @return a boolean
  def canJump(self, A):
    pos = 0
    reachable = 0
    while pos <= reachable:
      reachable = max(reachable, pos + A[pos])
      if reachable >= len(A) - 1:
        return True
      pos += 1
        
    return False      
