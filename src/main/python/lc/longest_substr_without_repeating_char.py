class Solution:
  # @return an integer
  def lengthOfLongestSubstring(self, s):
    word_pos = {}
    start = 0
    max_len = 0
    
    for end in range(len(s)):
      ch = s[end]
      if ch in word_pos:
        start = max(start, word_pos[ch] + 1)  # update start position
      max_len = max(max_len, end - start + 1)
      word_pos[ch] = end
      
    return max_len
