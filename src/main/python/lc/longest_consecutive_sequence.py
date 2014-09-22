class Solution:
  # @param num, a list of integer
  # @return an integer
  def longestConsecutive(self, num):
    nums = {}
    max_len = 0
    for i in num:
      nums[i] = 0
    for i in num:
      left, right = i - 1, i + 1
      count = 1
      while left in nums:
        del nums[left]
        count += 1
        left -= 1
      while right in nums:
        del nums[right]
        count += 1
        right += 1
      max_len = max(max_len, count)
    return max_len
