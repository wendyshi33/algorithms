# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param preorder, a list of integers
  # @param inorder, a list of integers
  # @return a tree node
  def buildTree(self, preorder, inorder):
    return self.build(preorder, 0, len(preorder) - 1, inorder, 0, len(inorder) - 1)
    
  def build(self, preorder, pre_start, pre_end, inorder, in_start, in_end):
    if pre_start > pre_end:
      return None
    
    root_idx = -1
    root = TreeNode(preorder[pre_start])
    for i in range(in_start, in_end + 1):
      if inorder[i] == root.val:
        root_idx = i
        break
    
    pre_mid = pre_start + 1 + (root_idx - 1 - in_start)
    root.left = self.build(preorder, pre_start + 1, pre_mid, inorder, in_start, root_idx - 1)
    root.right = self.build(preorder, pre_mid + 1, pre_end, inorder, root_idx + 1, in_end)
    return root
