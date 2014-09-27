class Solution:
  # @param S, a string
  # @param L, a list of string
  # @return a list of integer
  def findSubstring(self, S, L):
    res = []
    if len(L) == 0:
      return res
      
    word_len = len(L[0])
    total_len = word_len * len(L)
    
    needs = {}
    for word in L:
      if word in needs:
        needs[word] += 1
      else:
        needs[word] = 1
          
    for start in range(len(S) - total_len + 1):
      word_idx = 0
      has = {}
      for j in range(len(L)):
        cur_word = S[start + j * word_len : start + j * word_len + word_len]
        if cur_word not in needs:  # cur word is not needed
          break
        if cur_word not in has:  
          has[cur_word] = 0
        if has[cur_word] + 1 > needs[cur_word]:  # cur word is more than needed
          break
        has[cur_word] += 1
        word_idx += 1
      
      if word_idx == len(L):
        res.append(start)
        
    return res
