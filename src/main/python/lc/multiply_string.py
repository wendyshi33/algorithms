class Solution:
  # @param num1, a string
  # @param num2, a string
  # @return a string
  def multiply(self, num1, num2):
    res = [0 for i in range(len(num1) + len(num2))]
    for i in range(len(num1) - 1, -1, -1):
      carry = 0
      for j in range(len(num2) - 1, -1, -1):
        res[i + j + 1] += int(num1[i]) * int(num2[j]) + carry
        carry = res[i + j + 1] / 10
        res[i + j + 1] %= 10
      res[i] = carry
      
    head = 0
    while head < len(res) - 1 and res[head] == 0:
      head += 1
      
    return "".join([str(i) for i in res[head:]])
