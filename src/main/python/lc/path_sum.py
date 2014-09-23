# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @param sum, an integer
  # @return a boolean
  def hasPathSum(self, root, sum):
    cur_sum = 0
    return self.has_sum(root, cur_sum, sum)
    
  def has_sum(self, node, cur_sum, sum):
    if node is None:
      return False
    if node.left is None and node.right is None:
      return cur_sum + node.val == sum
    else:
      return self.has_sum(node.left, cur_sum + node.val, sum) or self.has_sum(node.right, cur_sum + node.val, sum)      
