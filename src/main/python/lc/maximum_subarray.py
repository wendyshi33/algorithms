class Solution:
    # @param A, a list of integers
    # @return an integer
    def maxSubArray(self, A):
        max_val = 0
        max_so_far = 0
        max_neg = sys.minint
        all_neg = True
        for val in A:
            if val >= 0:
                all_neg = False
            else:
                max_neg = max(max_neg, val)
            max_so_far = max(0, max_so_far)
            max_val = max(max_val, max_so_far)
        
        if all_neg:
            return max_neg
        else:
            return max_val
