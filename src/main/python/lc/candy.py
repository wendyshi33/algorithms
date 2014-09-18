class Solution:
	# @param ratings, a list of integer
	# @return an integer
	def candy(self, ratings):
		total = 0
		candies = [0] * len(ratings)
		candies[0] = 1
		addition = 1
		for i in range(1, len(ratings)):
			if ratings[i] > ratings[i - 1]:
				addition += 1
			else:
				addition = 1
			candies[i] = addition

		total += candies[len(candies) - 1]
		for i in range(len(ratings) - 2, -1, -1):
			if ratings[i] > ratings[i + 1]:
				candies[i] = min(candies[i + 1] + 1, candies[i])
			total += candies[i]

		return total
