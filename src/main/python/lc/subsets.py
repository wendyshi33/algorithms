class Solution:
  # @param S, a list of integer
  # @return a list of lists of integer
  def subsets(self, S):
    S = sorted(S)
    cur_idx = 0
    res = []
    cur = []
    self.sub(cur_idx, S, cur, res)
    return res
    
  def sub(self, cur_idx, S, cur, res):
    if cur_idx == len(S):
      res.append(cur)
    else:
      copy = list(cur)
      copy.append(S[cur_idx])
      self.sub(cur_idx + 1, S, copy, res)
      self.sub(cur_idx + 1, S, cur, res)      
