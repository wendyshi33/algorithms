class Solution:
  # @param s, a string
  # @return a string
  def reverseWords(self, s):
    res = []
    tokens = s.split(" ")
    for token in reversed(tokens):
      if token is not "":
        res.append(token)
        
    if len(tokens) == 0:
      return ""
      
    return " ".join(res)
