class Solution:
  # @return an integer
  def threeSumClosest(self, num, target):
    res = None
    num = sorted(num)
    for i in range(len(num) - 2):
      j = i + 1
      k = len(num) - 1
      while j < k:
        sum = num[i] + num[j] + num[k]
        if sum == target:
          return sum
        elif sum < target:
          j += 1
        elif sum > target:
          k -= 1
        if res is None or abs(target - sum) < abs(target - res):
          res = sum
      while i < len(num) - 2 and num[i] == num[i + 1]:
        i += 1
        
    return res    
