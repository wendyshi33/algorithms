# Definition for a  binary tree node
# class TreeNode:
# 	def __init__(self, x):
# 		self.val = x
# 		self.left = None
# 		self.right = None

class Solution:
	# @param root, a tree node
	# @return a tree node
	def recoverTree(self, root):
		pre = [None]
		first = [None]    
		second = [None]
		self.recover(root, pre, first, second)
		first[0].val, second[0].val = second[0].val, first[0].val

	def recover(self, node, pre, first, second):
		if node is None:
			return
		self.recover(node.left, pre, first, second)
		if pre[0] is not None:
			if pre[0].val > node.val: # out of order
				if first[0] is None:
					first[0] = pre[0]
				second[0] = node
		pre[0] = node
		self.recover(node.right, pre, first, second)
