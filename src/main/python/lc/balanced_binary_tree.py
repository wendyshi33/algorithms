# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a boolean
  def isBalanced(self, root):
    if root is None:
      return True
    return True if self.height(root) != -1 else False
    
  def height(self, root):
    if root is None:
      return 0
    else:
      left = self.height(root.left)
      right = self.height(root.right)
      if left == -1 or right == -1 or abs(left - right) > 1:
        return -1
      else:
        return max(left, right) + 1
