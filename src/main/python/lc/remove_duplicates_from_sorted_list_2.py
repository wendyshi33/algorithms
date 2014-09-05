# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @return a ListNode
  def deleteDuplicates(self, head):
    dummy = ListNode(-1)
    prev = dummy
    cur = head
    
    while cur is not None:
      count = 0
      next = cur.next
      while next is not None and next.val == cur.val:
        next = next.next
        count += 1
      if count > 0:
        prev.next = next
      else:
        prev.next = cur
        prev = cur
      cur = next
        
    return dummy.next
