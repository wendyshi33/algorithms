class Solution:
  # @return a list of integers
  def grayCode(self, n):
    if n == 0:
      return [0]
    bits = [[0], [1]]
    for i in range(1, n):
      reversed_list = []
      for bit in reversed(bits):
        new_bit = list(bit)
        new_bit.append(1)
        reversed_list.append(new_bit)
        bit.append(0)
      bits.extend(reversed_list)
      
    res = []      
    for bit in bits:
      val = 0
      base = 1
      for i in bit:
        val += (base * i)
        base *= 2
      res.append(val)
    return res
