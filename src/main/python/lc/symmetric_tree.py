# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param root, a tree node
  # @return a boolean
  def isSymmetric(self, root):
    if root is None:
      return True
    else:
      return self.symmetric(root.left, root.right)   
      
  def symmetric(self, left, right):
    if (left is None) != (right is None):
      return False
    elif left is not None:
      return left.val == right.val and self.symmetric(left.left, right.right) and self.symmetric(left.right, right.left)  
    else:
      return True 
