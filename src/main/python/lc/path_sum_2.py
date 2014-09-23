# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @param sum, an integer
  # @return a list of lists of integers
  def pathSum(self, root, sum):
    res = []
    cur_path = []
    cur_sum = 0
    self.path_sum(root, cur_sum, sum, cur_path, res)
    return res
    
  def path_sum(self, node, cur_sum, sum, cur_path, res):
    if node is None:
      return
    if node.left is None and node.right is None:
      if cur_sum + node.val == sum:
        new_res = list(cur_path)
        new_res.append(node.val)
        res.append(new_res)
    else:
      cur_path.append(node.val)
      self.path_sum(node.left, cur_sum + node.val, sum, cur_path, res)
      self.path_sum(node.right, cur_sum + node.val, sum, cur_path, res)
      del cur_path[-1]  
