class Solution:
  # @param prices, a list of integer
  # @return an integer
  def maxProfit(self, prices):
    if len(prices) == 0:
      return 0;
    min_val = prices[0]
    profit = 0
    for price in prices:
      min_val = min(min_val, price)
      profit = max(profit, price - min_val)
      
    return profit      
