class Solution:
	# @param triangle, a list of lists of integers
	# @return an integer
	def minimumTotal(self, triangle):
		if len(triangle) == 0:
			return 0

		last_row = len(triangle) - 1
		last_col = len(triangle[last_row])
		res = [[0 for c in range(last_col)] for r in range(2)]    

		for c in range(last_col):
			res[last_row % 2][c] = triangle[last_row][c]

		for r in range(last_row - 1, -1, -1):
			total_col = len(triangle[r])
			for c in range(total_col):
				res[r % 2][c] = min(res[(r + 1) % 2][c], res[(r + 1) % 2][c + 1])
				res[r % 2][c] += triangle[r][c]

		return res[0][0]
