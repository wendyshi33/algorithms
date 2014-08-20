# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree node
    # @return nothing
    def connect(self, root):
        if root is None:
            return
        if root.left is not None:
            root.left.next = root.right
            root_next = root.next
            if root_next is not None:
                root.right.next = root_next.left
            self.connect(root.right)
            self.connect(root.left)
