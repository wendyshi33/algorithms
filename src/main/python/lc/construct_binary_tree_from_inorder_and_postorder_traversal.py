# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
  # @param inorder, a list of integers
  # @param postorder, a list of integers
  # @return a tree node
  def buildTree(self, inorder, postorder):
    return self.build(inorder, 0, len(inorder) - 1, postorder, 0, len(postorder) - 1)
    
  def build(self, inorder, in_start, in_end, postorder, post_start, post_end):
    if post_start > post_end:
      return None
    root = TreeNode(postorder[post_end])
    root_idx = -1
    for i in range(in_start, in_end + 1):
      if inorder[i] == root.val:
        root_idx = i
        break
    
    post_mid = post_start + (root_idx - in_start - 1)
    root.left = self.build(inorder, in_start, root_idx - 1, postorder, post_start, post_mid)
    root.right = self.build(inorder, root_idx + 1, in_end, postorder, post_mid + 1, post_end - 1)
    return root;
