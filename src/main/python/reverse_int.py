class Solution:
    # @return an integer
    def reverse(self, x):
        sign = 0
        if x != 0:
            sign = abs(x) / x
        res = 0
        x = abs(x)
        while x > 0:
            res = res * 10 + x % 10
            x /= 10
        return res * sign
