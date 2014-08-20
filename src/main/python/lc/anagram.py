class Solution:
	def anagram(self, strs):
		d = {}
		res = []
		for s in strs:
			sorted_s = "".join(sorted(s))
			if sorted_s not in d:
				d[sorted_s] = []
			d[sorted_s].append(s)

		for bucket in d.values():
			if len(bucket) > 1:
				res.extend(bucket)

		return res
