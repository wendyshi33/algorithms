class Solution:
  # @return a list of lists of integers
  def combine(self, n, k):
    res = []
    cur = []
    start = 0
    self.comb(n, k, start, cur, res)
    return res
    
  def comb(self, n, k, start, cur, res):
    if len(cur) == k:
      res.append(cur)
    elif start < n:
      new_cur = list(cur)
      new_cur.append(start + 1)
      self.comb(n, k, start + 1, new_cur, res)
      self.comb(n, k, start + 1, cur, res)      
