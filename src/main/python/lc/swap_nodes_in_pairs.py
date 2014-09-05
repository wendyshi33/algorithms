# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param a ListNode
    # @return a ListNode
    def swapPairs(self, head):
      if head is None:
        return None
      if head.next is None:
        return head
      next = head.next
      next_next = self.swapPairs(next.next)
      next.next = head
      head.next = next_next
      return next
