# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a boolean
    def hasCycle(self, head):
        if head is not None:
            slow = head
            if slow.next is not None:
                fast = slow.next.next
                while fast is not None and fast.next is not None:
                    slow, fast = slow.next, fast.next.next
                    if slow == fast:
                        return True
                return False
            else:
                return False
        else:
            return False
