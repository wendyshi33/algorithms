class Solution:
  # @return a list of lists of string
  def solveNQueens(self, n):
    queens = [0] * n
    cur = 0
    res = []
    self.count_result(queens, cur, res)
    return res
    
  def count_result(self, queens, cur, res):
    if cur == len(queens):
      res.append(self.create_board(queens))
    else:
      for col in range(len(queens)):
        can_place = True
        for prev in range(cur):
          if queens[prev] == col or queens[prev] + prev == col + cur or queens[prev] - prev == col - cur:
            can_place = False
            break
        if can_place:
          queens[cur] = col
          self.count_result(queens, cur + 1, res)
  
  def create_board(self, queens):
    board = []
    for i in range(len(queens)):
      row = ['.'] * len(queens)
      row[queens[i]] = 'Q'
      board.append(''.join(row))
    return board
