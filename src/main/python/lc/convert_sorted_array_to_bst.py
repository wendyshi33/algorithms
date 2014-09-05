# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param num, a list of integers
  # @return a tree node
  def sortedArrayToBST(self, num):
    if len(num) == 0:
      return None
    idx = len(num) / 2
    root = TreeNode(num[idx])
    if root is not None:
      root.left = self.sortedArrayToBST(num[:idx])
      root.right = self.sortedArrayToBST(num[idx + 1:])
    return root
