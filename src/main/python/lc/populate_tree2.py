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
        if root.left is not None and root.right is not None:
            root.left.next = root.right
        root_next = root.next
        need_next = root.left if root.right is None else root.right
        if need_next is not None:
            next = None
            while next is None and root_next is not None:
                next = root_next.right if root_next.left is None else root_next.left
                root_next = root_next.next
            need_next.next = next
        self.connect(root.right)
        self.connect(root.left)
