class Solution:
    # @param A, a list of integers
    # @param target, an integer to be inserted
    # @return integer
    def searchInsert(self, A, target):
        return self.searchIterative(A, 0, len(A) - 1, target)
        
    def searchRecursive(self, A, start, end, target):
        if start > end:
            return start
        mid = (start + end) / 2
        if A[mid] == target:
            return mid
        elif A[mid] < target:
            return self.searchRecursive(A, mid + 1, end, target)
        else:
            return self.searchRecursive(A, start, mid - 1, target)
            
    def searchIterative(self, A, start, end, target):
        while start <= end:
            mid = (start + end) / 2
            if target == A[mid]:
                return mid
            elif target < A[mid]:
                end = mid - 1
            else:
                start = mid + 1
        return start
