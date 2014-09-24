# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a boolean
  def isValidBST(self, root):
    lower = -2**31
    upper = 2**31
    return self.is_valid(root, lower, upper)
    
  def is_valid(self, node, lower, upper):
    if node is None:
      return True
    elif lower < node.val and node.val < upper:
      return self.is_valid(node.left, lower, node.val) and self.is_valid(node.right, node.val, upper)
    else:
      return False
