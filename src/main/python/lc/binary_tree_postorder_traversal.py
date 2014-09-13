# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a list of integers
  def postorderTraversal(self, root):
    res = []
    if root is None:
      return res
    stack = []
    stack.append(root)
    prev = None
    while len(stack) > 0:
      cur = stack[-1]
      if prev is None or prev.left == cur or prev.right == cur:
        if cur.left is not None:
          stack.append(cur.left)
        elif cur.right is not None:
          stack.append(cur.right)
      elif cur.left == prev:
        if cur.right is not None:
          stack.append(cur.right)
      else:
        res.append(cur.val)
        stack.pop()
      prev = cur
      
    return res      
