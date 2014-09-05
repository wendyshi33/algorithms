class Solution:
  # @return an integer
  def totalNQueens(self, n):
    cur, total, queens = 0, [0], [0] * n
    self.count_total(queens, cur, total)
    return total[0]
    
  def count_total(self, queens, cur, total):
    if cur == len(queens):
			total[0] += 1
    else:
      for col in range(len(queens)):
        can_place = True
        for prev in range(cur):
          if queens[prev] == col or cur - col == prev - queens[prev] or col + cur == queens[prev] + prev:
            can_place = False
            break
        if can_place:
					queens[cur] = col
					self.count_total(queens, cur + 1, total)

if __name__ == '__main__':
	s = Solution()
	print(s.totalNQueens(2))
