# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @return nothing
  def reorderList(self, head):
    if head is None or head.next is None:
      return
    
    # decompose list to two halves
    slow = fast = head
    while fast.next is not None and fast.next.next is not None:
      slow = slow.next
      fast = fast.next.next
    
    first_half = head
    second_half = slow.next      
    slow.next = None
    
    # reverse second half
    prev = None
    cur = second_half
    while cur is not None:
      next = cur.next
      cur.next = prev
      prev = cur
      cur = next
    second_half = prev
    
    # merge
    new_head = ListNode(0)
    cur = new_head
    add_first = True
    while first_half is not None or second_half is not None:
      if add_first:
        cur.next = first_half
        first_half = first_half.next
      else:
        cur.next = second_half
        second_half = second_half.next
        
      add_first = not add_first
      cur = cur.next
    
    head = new_head.next
