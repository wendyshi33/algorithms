# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @return a ListNode
  def insertionSortList(self, head):
    if head is None or head.next is None:
      return head
    new_head = ListNode(0)
    new_head.next = head
    remaining_head = head.next
    head.next = None
    
    while remaining_head is not None:
      sorted_prev = new_head  # find the insertion position
      while sorted_prev.next is not None and sorted_prev.next.val < remaining_head.val:
        sorted_prev = sorted_prev.next
        
      new_remaining_head = remaining_head.next
      if sorted_prev.next is None:  # append to tail of sorted list
        sorted_prev.next = remaining_head
        remaining_head.next = None
      else:  # insert into sorted list
        remaining_head.next = sorted_prev.next
        sorted_prev.next = remaining_head
        
      remaining_head = new_remaining_head
      
    return new_head.next
