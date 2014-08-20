# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a ListNode
    def deleteDuplicates(self, head):
        if head is None:
            return None
        prev = head
        cur = prev.next
        while cur is not None:
            if prev.val != cur.val:
                prev.next = cur
                prev = cur
            else:
                prev.next = None
            cur = cur.next
        
        return head
