class Solution:
  # @param an integer
  # @return a list of string
  def generateParenthesis(self, n):
    cur = []
    res = []      
    left, right = n, n
    self.generate(cur, left, right, res)
    return res
    
  def generate(self, cur, left, right, res):
    if left == 0 and right == 0:
      res.append(''.join(cur))
    else:
      if left > 0:
        cur.append('(')
        self.generate(cur, left - 1, right, res)
        cur.pop()
      if left < right:
        cur.append(')')
        self.generate(cur, left, right - 1, res)
        cur.pop()
