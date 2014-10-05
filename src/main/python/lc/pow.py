class Solution:
  # @param x, a float
  # @param n, a integer
  # @return a float
  def pow(self, x, n):
    if n == 0:
      return 0 if x == 0 else 1
    elif n == 1:
      return x
    else:
      neg = False
      if n < 0:
        neg = True
        n = abs(n)
      remain = n % 2
      half = self.pow(x, n / 2)
      res = self.pow(x, n % 2) * half * half
      return res if not neg else 1.0 / res
