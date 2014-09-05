class Solution:
  # @param A a list of integers
  # @return an integer
  def removeDuplicates(self, A):
    if len(A) < 3:
      return len(A)
    new_len = 2
    for i in range(2, len(A)):
      if not (A[i] == A[new_len - 1] and A[i] == A[new_len - 2]):
        A[new_len] = A[i]
        new_len += 1
    return new_len
