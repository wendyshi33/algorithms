class Solution:
  # @return a tuple, (index1, index2)
  def twoSum(self, num, target):
    index = {}
    for i in range(len(num)):
      if num[i] in index and num[i] * 2 == target:
        return (min(i + 1, index[num[i]]), max(i + 1, index[num[i]]))
      index[num[i]] = i + 1
    
    for i in range(len(num)):
      if target - num[i] in index and num[i] * 2 != target:
        other = index[target - num[i]]
        return (min(i + 1, other), max(i + 1, other))
        
    return None
