class Solution:
  # @param num, a list of integer
  # @return an integer
  def findMin(self, num):
    first, last = 0, len(num) - 1
    res = 2**31
    
    while first <= last:
      mid = (first + last) / 2
      res = min(res, num[mid])
      
      if num[first] < num[mid]:
        res = min(num[first], res)
        first = mid + 1
      else:
        if mid + 1 < len(num):
          res = min(res, num[mid + 1])
        last = mid - 1
        
    return res
