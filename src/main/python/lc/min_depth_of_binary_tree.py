# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return an integer
  def minDepth(self, root):
    if root is None:
      return 0
    cur_level = 1
    min_depth = [2**31]
    self.min_depth(root, cur_level, min_depth)
    return min_depth[0]
    
  def min_depth(self, node, cur_level, min_depth):
    if node.left is None and node.right is None:
      min_depth[0] = min(min_depth[0], cur_level)
    else:
      if node.left is not None:
        self.min_depth(node.left, cur_level + 1, min_depth)
      if node.right is not None:
        self.min_depth(node.right, cur_level + 1, min_depth)      
