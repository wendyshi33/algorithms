class Solution:
  # @return a string
  def longestCommonPrefix(self, strs):
    if len(strs) == 0:
      return ""
      
    min_len = 2**31
    min_str = None
    for str in strs:
      if len(str) < min_len:
        min_len = len(str)
        min_str = str
        
    if min_len == 0:
      return ""
      
    res = []
    for i in range(min_len):
      for str in strs:
        if str[i] != min_str[i]:
          return "".join(res)
      res.append(min_str[i])
      
    return "".join(res)
