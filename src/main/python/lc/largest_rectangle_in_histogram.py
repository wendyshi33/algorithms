class Solution:
  # @param height, a list of integer
  # @return an integer
  def largestRectangleArea(self, height):
    to_left = [0] * len(height)
    bars = []
    
    for i in range(len(height)):
      while len(bars) != 0 and height[bars[-1]] >= height[i]:
        del bars[-1]
      to_left[i] = i if len(bars) == 0 else i - bars[-1] - 1
      bars.append(i)
    
    bars = []  
    to_right = [0] * len(height)
    for i in range(len(height) - 1, -1, -1):
      while len(bars) != 0 and height[bars[-1]] >= height[i]:
        del bars[-1]
      to_right[i] = bars[-1] - i - 1 if len(bars) != 0 else len(height) - 1 - i
      bars.append(i)
      
    max_area = 0
    for i in range(len(height)):
      max_area = max(max_area, height[i] * (to_left[i] + to_right[i] + 1))
      
    return max_area
