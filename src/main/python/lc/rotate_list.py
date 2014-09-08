# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
  # @param head, a ListNode
  # @param k, an integer
  # @return a ListNode
  def rotateRight(self, head, k):
    if head is None or head.next is None:
      return head      
    length = 0
    cur = head
    oldTail = head
    while cur is not None:
      length += 1
      oldTail = cur
      cur = cur.next
    
    k %= length
    if k == 0:
      return head
    newTail = head
    for i in range(length - k - 1):
      newTail = newTail.next
      
    newHead = newTail.next
    newTail.next = None
    oldTail.next = head
    return newHead
