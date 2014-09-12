class Solution:
  # @return a string
  def getPermutation(self, n, k):
    num = [i + 1 for i in range(n)]
    if k == 1:
      return "".join([str(i) for i in num])
    
    for i in range(k - 1):
      self.next(num)
    return "".join([str(i) for i in num])
    
  def next(self, num):
    last_smaller = len(num) - 2
    if last_smaller < 0:
      return
    while num[last_smaller] >= num[last_smaller + 1]:
      last_smaller -= 1
      if last_smaller < 0:
        return
    
    first_bigger = len(num) - 1
    while num[first_bigger] <= num[last_smaller]:
      first_bigger -= 1
    
    num[first_bigger], num[last_smaller] = num[last_smaller], num[first_bigger]
    last_smaller += 1
    
    last = len(num) - 1
    while last > last_smaller:
      num[last], num[last_smaller] = num[last_smaller], num[last]
      last -= 1
      last_smaller += 1      
