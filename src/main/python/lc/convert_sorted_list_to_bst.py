# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
  # @param head, a list node
  # @return a tree node
  def sortedListToBST(self, head):
    length = 0
    cur = [head]
    while cur[0] is not None:
      length += 1
      cur[0] = cur[0].next
    cur[0] = head
    return self.convert(cur, 0, length - 1)
    
  def convert(self, cur, first_idx, last_idx):
    if first_idx <= last_idx:
      mid = (first_idx + last_idx) / 2
      left = self.convert(cur, first_idx, mid - 1)
      node = TreeNode(cur[0].val)
      node.left = left
      cur[0] = cur[0].next
      node.right = self.convert(cur, mid + 1, last_idx)
      return node
    else:
      return None
