class Solution:
    # @param n, an integer
    # @return an integer
    def climbStairs(self, n):
        nums = [0] * (n + 1)
        nums[0] = 1
        if n >= 1:
            nums[1] = 1
        for i in range(2, n + 1):
            nums[i] = nums[i - 1] + nums[i - 2]
        return nums[n]
