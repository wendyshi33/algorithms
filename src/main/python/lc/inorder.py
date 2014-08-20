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
        if root is not None:
            stack.append(root)
        while len(stack) != 0:
            cur = stack[len(stack) - 1]
            if cur.left is not None:
                left = cur.left
                cur.left = None
                stack.append(left)
            else:
                cur = stack.pop()
                res.append(cur.val)
                if cur.right is not None:
                    stack.append(cur.right)
            
        return res
