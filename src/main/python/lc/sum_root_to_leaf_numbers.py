# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return an integer
  def sumNumbers(self, root):
    res = [0]
    cur = 0
    self.dfs(root, cur, res)      
    return res[0]
    
  def dfs(self, node, cur, res):
    if node is None:
      return
    elif node.left is None and node.right is None:
      res[0] += cur * 10 + node.val
    else:
      self.dfs(node.left, cur * 10 + node.val, res)
      self.dfs(node.right, cur * 10 + node.val, res)
