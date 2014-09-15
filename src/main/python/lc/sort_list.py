# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @return a ListNode
  def sortList(self, head):
    if head is None or head.next is None:
      return head
    slow = head
    fast = head
    while fast.next is not None and fast.next.next is not None:
      slow = slow.next
      fast = fast.next.next
      
    fast = slow.next
    slow.next = None
    first_half = self.sortList(head)
    second_half = self.sortList(fast)
    return self.merge(first_half, second_half)
    
  def merge(self, first, second):
    new_head = ListNode(0)
    cur = new_head
    while first is not None or second is not None:
      if first is None:
        cur.next = second
        second = second.next
      elif second is None:
        cur.next = first
        first = first.next
      elif first.val <= second.val:
        cur.next = first
        first = first.next
      else:
        cur.next = second
        second = second.next
      cur = cur.next
      
    return new_head.next      
