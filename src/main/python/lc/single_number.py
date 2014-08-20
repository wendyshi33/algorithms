class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        single = 0
        if len(A) != 0:
            single = A[0]
            for v in A[1:]:
                single ^= v
        return single
