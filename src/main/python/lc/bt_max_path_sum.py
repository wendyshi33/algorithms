# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return an integer
  def maxPathSum(self, root):
    res = [-2**31]
    self.max_sum(root, res)
    return res[0]
    
  def max_sum(self, node, res):
    if node is None:
      return 0
    left = self.max_sum(node.left, res)
    right = self.max_sum(node.right, res)
    max_ext = max(left, right, 0) + node.val
    res[0] = max(res[0], max_ext, left + right + node.val)
    return max_ext 
