class Solution:
    # @return an integer
    def romanToInt(self, s):
        if len(s) == 0:
            return 0
        num_map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        prev = num_map[s[0]]
        res = prev
        for i in range(1, len(s)):
            cur = num_map[s[i]]
            if cur > prev:
                res += cur - 2 * prev
            else:
                res += cur
            prev = cur
        return res
        
