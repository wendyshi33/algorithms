class Solution:
  # @return a list of lists of length 4, [[val1,val2,val3,val4]]
  def fourSum(self, num, target):
    res = []
    num = sorted(num)
    for i in range(len(num) - 3):
      for j in range(i + 1, len(num) - 2):
        k, l = j + 1, len(num) - 1
        while k < l:
          sum = num[i] + num[j] + num[k] + num[l]
          if sum == target:
            res.append([num[i], num[j], num[k], num[l]])
            k, l = k + 1, l - 1
            while k < l and num[k] == num[k - 1]:
              k += 1
            while k < l and num[l] == num[l - 1]:
              l -= 1
          elif sum < target:
            k += 1
          else:
            l -= 1
        while j < num.length - 2 and num[j] == num[j + 1]:
          j += 1
          
      while i < num.length - 3 and num[i] == num[i + 1]:
        i += 1
