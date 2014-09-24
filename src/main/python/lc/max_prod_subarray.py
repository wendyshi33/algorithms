class Solution:
  # @param A, a list of integers
  # @return an integer
  def maxProduct(self, A):
    max_val = -2 ** 31
    prod = 1
    for i in A:
      prod *= i
      max_val = max(max_val, prod)
      if i == 0:
        prod = 1
        
    prod = 1
    for i in reversed(A):
      prod *= i
      max_val = max(max_val, prod)
      if i == 0:
        prod = 1
        
    return max_val      
