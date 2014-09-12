class Solution:
  # @param num, a list of integer
  # @return a list of lists of integers
  def permuteUnique(self, num):
    res = []
    num = sorted(num)
    res.append(list(num))
    while self.next(num) is True:
      res.append(list(num)) 
    return res
    
  def next(self, num):
    last_smaller = len(num) - 2
    if last_smaller < 0:
      return False
    while num[last_smaller] >= num[last_smaller + 1]:
      last_smaller -= 1
      if last_smaller < 0:
        return False
    
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
      
    return True
