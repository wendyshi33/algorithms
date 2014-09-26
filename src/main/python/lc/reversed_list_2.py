# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @param m, an integer
  # @param n, an integer
  # @return a ListNode
  def reverseBetween(self, head, m, n):
    fake_head = ListNode(0)
    fake_head.next = head
    len = n - m
    before = fake_head
    for i in range(m - 1):
      before = before.next
      
    reversed_tail = before.next
    pre = None
    cur = reversed_tail
    before.next = None
    for i in range(n - m + 1):
      next = cur.next
      cur.next = pre
      pre = cur
      cur = next
      
    before.next = pre
    reversed_tail.next = cur
    
    return fake_head.next
