class Solution:
  # @param board, a list of lists of 1 length string
  # @param word, a string
  # @return a boolean
  def exist(self, board, word):
    if len(board) == 0 or len(board[0]) == 0:
      return len(word) == 0
    row = len(board)
    col = len(board[0])
    visit = [[0 for c in range(col)] for r in range(row)]
    for r in range(row):
      for c in range(col):
        if self.search(board, visit, r, c, word, 0):
          return True
    return False
    
  def search(self, board, visit, r, c, word, pos):
    if board[r][c] != word[pos]:
      return False
    
    if pos == len(word) - 1:
      return True
    
    visit[r][c] = True
    
    if r - 1 >= 0 and not visit[r - 1][c] and self.search(board, visit, r - 1, c, word, pos + 1):
      return True
    if r + 1 < len(board) and not visit[r + 1][c] and self.search(board, visit, r + 1, c, word, pos + 1):
      return True
    if c - 1 >= 0 and not visit[r][c - 1] and self.search(board, visit, r, c - 1, word, pos + 1):
      return True
    if c + 1 < len(board[0]) and not visit[r][c + 1] and self.search(board, visit, r, c + 1, word, pos + 1):
      return True
      
    visit[r][c] = False
      
    return False      
