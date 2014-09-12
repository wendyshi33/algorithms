class Solution:
  # @param num, a list of integer
  # @return a list of integer
  def nextPermutation(self, num):
    last_smaller = len(num) - 2
    if last_smaller < 0:
      return num
      
    while num[last_smaller] >= num[last_smaller + 1]:
      last_smaller -= 1
      if last_smaller < 0:
        num = sorted(num)
        return num
    
    first_bigger = len(num) - 1
    while num[first_bigger] <= num[last_smaller]:
      first_bigger -= 1
    
    num[first_bigger], num[last_smaller] = num[last_smaller], num[first_bigger]
    last_smaller += 1
    
    last = len(num) -1
    while last > last_smaller:
      num[last], num[last_smaller] = num[last_smaller], num[last]
      last_smaller += 1
      last -= 1     
    return num
