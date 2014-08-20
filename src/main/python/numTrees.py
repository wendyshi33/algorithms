class Solution:
		# @return an integer
		def numTrees(self, n):
				return self.numTreesDP(n)

		def numTreesRecursive(self, n):
				if n == 0 or n == 1:
						return 1
				else:
						num = 0
						for i in range(n):
								num += self.numTreesRecursive(n - i - 1) * self.numTreesRecursive(i)
						return num

		def numTreesDP(self, n):
				nums = [0] * (n + 1)
				nums[0] = 1
				if n > 0:
					nums[1] = 1
				for i in range(2, len(nums)):
						for j in range(i):
								nums[i] += nums[j] * nums[i - j - 1]
				return nums[n]
