class Solution:
  # @param s, a string
  # @param dict, a set of string
  # @return a boolean
  def wordBreak(self, s, dict):
    start, end = 0, len(s)
    cache = {}
    return self.check(s, start, end, dict, cache)
    
  def check(self, s, start, end, dict, cache):
    if start >= end:
      return True
    word = s[start:end]
    if word in cache:
      return cache[word]
      
    if word in dict:
      cache[word] = True
      return True
    
    for i in range(start + 1, end):
      if self.check(s, start, i, dict, cache) and self.check(s, i, end, dict, cache):
        cache[word] = True
        return True
    cache[word] = False
    return False      
