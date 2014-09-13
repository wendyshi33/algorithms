# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a list of integers
  def inorderTraversal(self, root):
    res = []
    stack = []
    cur = root
    while cur is not None or len(stack) > 0:
      while cur is not None:
        stack.append(cur)
        cur = cur.left
        
      next = stack.pop()
      res.append(next.val)
      
      cur = next.right
    
    return res
