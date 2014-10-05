class Solution:
  # @return a list of lists of length 3, [[val1,val2,val3]]
  def threeSum(self, num):
    num = sorted(num)
    res = []
    for i in range(len(num) - 2):
      j = i + 1
      k = len(num) - 1
      while j < k:
        sum = num[i] + num[j] + num[k]
        if sum == 0:
          res.append([num[i], num[j], num[k]])
          j, k = j + 1, k - 1
          while j < k and num[j] == num[j - 1]:
            j += 1
          while j < k and num[k] == num[k + 1]:
            k -= 1
        elif sum < 0:
          j += 1
        else:
          k -= 1
      while i < len(num) - 2 and num[i] == num[i + 1]:
        i += 1
        
    return res
