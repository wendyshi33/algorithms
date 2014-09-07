class Solution:
	# @return a list of lists of integers
	def generate(self, numRows):
		if numRows == 0:
			return []      
		res = [[1]]
		cur = res[0]
		for i in range(1, numRows):
			new_row = [1]
			for c in range(1, i):
				new_row.append(cur[c - 1] + cur[c])
			new_row.append(1)
			res.append(new_row)
			cur = new_row

		return res
