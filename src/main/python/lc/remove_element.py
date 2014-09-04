class Solution:
    # @param    A       a list of integers
    # @param    elem    an integer, value need to be removed
    # @return an integer
    def removeElement(self, A, elem):
        newLen = 0
        last = len(A) - 1
        while newLen <= last:
            if A[newLen] == elem:
                A[newLen], A[last] = A[last], A[newLen]
                last -= 1
            else:
                newLen += 1
        return newLen
