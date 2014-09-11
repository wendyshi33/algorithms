# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a list of lists of integers
  def levelOrderBottom(self, root):
    res = []
    cur_level = []
    if root is not None:
      cur_level.append(root)
      
    while len(cur_level) != 0:
      next_level = []
      cur_res = []
      while len(cur_level) != 0:
        cur = cur_level.pop(0)
        cur_res.append(cur.val)
        if cur.left is not None:
          next_level.append(cur.left)
        if cur.right is not None:
          next_level.append(cur.right)
      cur_level = next_level
      res.append(cur_res)
    res.reverse()
    return res      
