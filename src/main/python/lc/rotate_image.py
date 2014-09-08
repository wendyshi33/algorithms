class Solution:
	# @param matrix, a list of lists of integers
	# @return a list of lists of integers
	def rotate(self, matrix):
		for layer in range(len(matrix) / 2):
			end = len(matrix) - layer - 1
			for start in range(layer, end):      
				tmp = matrix[layer][start]
				matrix[layer][start] = matrix[len(matrix) - 1 - start][layer]
				matrix[len(matrix) - 1 - start][layer] = matrix[len(matrix) - 1 - layer][len(matrix) - 1 - start]
				matrix[len(matrix) - 1 - layer][len(matrix) - 1 - start] = matrix[start][len(matrix) - 1 - layer]
				matrix[start][len(matrix) - 1 - layer] = tmp

if __name__ == '__main__':
	s = Solution()
	m = [[1]]
	s.rotate(m)
	print(m)
