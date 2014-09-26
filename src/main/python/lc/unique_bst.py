class Solution:
  # @return an integer
  def numTrees(self, n):
    if n == 0:
      return 0
    res = [0 for i in range(n + 1)]
    res[0] = res[1] = 1
    for i in range(2, n + 1):
      for j in range(i):
        res[i] += res[j] * res[i - j - 1]
    return res[n]    
