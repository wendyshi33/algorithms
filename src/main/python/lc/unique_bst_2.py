# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
	# @return a list of tree node
	def generateTrees(self, n):
		return self.generate(1, n)

	def generate(self, start, end):
		roots = []
		if start > end:
			roots.append(None)
			return roots

		for i in range(start, end + 1):
			left = self.generate(start, i - 1)
			right = self.generate(i + 1, end)
			for l in left:
				for r in right:
					root = TreeNode(i)
					root.left = l
					root.right = r
					roots.append(root)

		return roots      
