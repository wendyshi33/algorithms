class Solution:
  # @param board, a 9x9 2D array
  # @return a boolean
  def isValidSudoku(self, board):
    row = [[False] * 9 for r in range(len(board))]  
    col = [[False] * 9 for r in range(len(board))]  
    blks = [[False] * 9 for r in range(len(board))]  

    for r in range(len(board)):
      for c in range(len(board[r])):
        if board[r][c] == '.':
          continue
        val = ord(board[r][c]) - ord('1')
        
        if row[r][val] or \
            col[c][val] or \
            blks[r / 3 * 3 + c / 3][val]:
          return False
        row[r][val] = col[c][val] = blks[r / 3 * 3 + c / 3][val] = True
        
    return True


if __name__ == '__main__':
  s = Solution()
  board = [".87654321","2........","3........","4........","5........","6........","7........","8........","9........"]
  s.isValidSudoku(board)
