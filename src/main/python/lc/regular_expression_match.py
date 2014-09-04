class Solution:
	# @return a boolean
	def isMatch(self, s, p):
		m = len(s); n = len(p)
		match = [[False for i in range(n + 1)] for i in range(m + 1)]
		print(match)
		match[0][0] = True
		print(match)

		for i in range(1, n + 1):
			if p[i - 1] == '*':
				match[0][i] = match[0][i - 2]  # if prefix matches, then current pattern can also match

			for i in range(1, m + 1):
				for j in range(1, n + 1):
					if p[j - 1] != '*':
						match[i][j] = match[i - 1][j - 1] and (s[i - 1] == p[j - 1] or p[j - 1] == '.')  # current pattern matches
					else: # p[j - 1] == '*'
						match[i][j] = match[i][j - 2]  # current 'x*' matches nothing
						if p[j - 2] == '.' or s[i - 1] == p[j - 2]: # current 'x*' matches
							match[i][j] |= match[i - 1][j]

		return match[m][n]
