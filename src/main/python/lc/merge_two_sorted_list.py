# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param two ListNodes
    # @return a ListNode
    def mergeTwoLists(self, l1, l2):
        head = ListNode(-1)
        cur = head
        cur_first = l1
        cur_second = l2
        while cur_first is not None or cur_second is not None:
            if cur_second is None:
                cur.next = cur_first
                cur_first = cur_first.next
            elif cur_first is None:
                cur.next = cur_second
                cur_second = cur_second.next
            elif cur_first.val<= cur_second.val:
                cur.next = cur_first
                cur_first = cur_first.next
            else:
                cur.next = cur_second
                cur_second = cur_second.next
            cur = cur.next
        return head.next
