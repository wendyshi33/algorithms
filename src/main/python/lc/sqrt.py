class Solution:
  # @param x, an integer
  # @return an integer
  def sqrt(self, x):
    guess = 1
    while not self.is_close_enough(x, guess):
      guess = (float(x) / guess + guess) / 2
      
    return int(guess)
    
  def is_close_enough(self, target, guess):
    if abs(target - guess * guess) < 1:
      return True
    else:
      return False
