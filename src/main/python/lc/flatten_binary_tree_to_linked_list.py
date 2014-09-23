# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return nothing, do it in place
  def flatten(self, root):
    root = self.flat(root)
    
  def flat(self, node):
    if node is None:
      return None
      
    left = self.flat(node.left)
    right = self.flat(node.right)
    node.left = node.right = None
    
    if left is None:
      node.right = right
    else:
      left_tail = left
      while left_tail.right is not None:
        left_tail = left_tail.right
      node.right = left
      left_tail.right = right
      
    return node
