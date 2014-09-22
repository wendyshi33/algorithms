class Solution:
  # @param s, a string
  # @return a list of lists of string
  def partition(self, s):
    res = []
    cur = []
    start_pos = 0
    self.dfs(s, start_pos, cur, res)
    return res
    
  def dfs(self, s, start_pos, cur, res):
    if start_pos == len(s):
      res.append(list(cur))
    else:
      for end in range(start_pos, len(s)):
        if self.is_palindrome(s, start_pos, end):
          cur.append(s[start_pos:end + 1])
          self.dfs(s, end + 1, cur, res)
          del cur[-1]
  
  def is_palindrome(self, s, start, end):
    while start <= end:
      if s[start] != s[end]:
        return False
      start += 1
      end -= 1
    return True
