class Solution:
  # @param a list of integers
  # @return an integer
  def removeDuplicates(self, A):
    if len(A) == 0:
      return 0
    new_len = 1 
    for i in range(1, len(A)):
      if A[i] != A[i - 1]:
        A[new_len] = A[i]
        new_len += 1
    return new_len
