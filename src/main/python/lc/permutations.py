class Solution:
  # @param num, a list of integer
  # @return a list of lists of integers
  def permute(self, num):
    res = []
    cur = sorted(num)
    res.append(list(cur))
    while self.next(cur) is True:
      res.append(list(cur))
    return res
    
  def next(self, l):
    # find the last element that is smaller than the next element
    last_smaller = len(l) - 2
    if last_smaller < 0:
      return False
    while l[last_smaller] >= l[last_smaller + 1]:
      last_smaller -= 1
      if last_smaller < 0:
        return False
        
    # from tail to head, find the first element that is bigger than the last_smaller element
    first_bigger = len(l) - 1
    while l[first_bigger] <= l[last_smaller]:
      first_bigger -= 1
    l[last_smaller], l[first_bigger] = l[first_bigger], l[last_smaller]
    last_smaller += 1
    
    # reverse the elements after last_smaller
    last = len(l) - 1
    while last > last_smaller:
      l[last], l[last_smaller] = l[last_smaller], l[last]
      last -= 1
      last_smaller += 1
      
    return True 
