class Solution:
	# @param digits, a list of integer digits
	# @return a list of integer digits
	def plusOne(self, digits):
		carry = 1
		for i in range(len(digits) - 1, -1, -1):
			digits[i] += carry
			carry = digits[i] / 10
			digits[i] %= 10

		if carry == 0:
			return digits
		else:
			res = [1]
			res.extend(digits)
			return res 
