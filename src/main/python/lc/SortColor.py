class Solution:
    # @param A a list of integers
    # @return nothing, sort in place
    def sortColors(self, A):
        left = 0
        right = len(A) - 1
        cur = 0
        while cur <= right:
            if A[cur] == 0:
                A[cur], A[left] = A[left], A[cur]
                left += 1
                cur += 1
            elif A[cur] == 1:
                cur += 1
            elif A[cur] == 2:
                A[cur], A[right] = A[right], A[cur]
                right -= 1
