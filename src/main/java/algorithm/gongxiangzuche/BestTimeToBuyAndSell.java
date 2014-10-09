package algorithm.gongxiangzuche;

/**
 * Given a sequence of stock prices, find the best buy and sell time.
 *
 * Time complexity: O(N), space complexity: O(1).
 *
 */
public class BestTimeToBuyAndSell {

  public int[] bestTime(int[] prices) {
    int[] ret = new int[2];
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    int candidateBuy = -1;
    int candidateSell = -1;
    
    for (int i = 0; i < prices.length; ++i) {
      if (minPrice > prices[i]) {
        minPrice = prices[i];
        candidateBuy = i;
        candidateSell = -1;
      }
      if (maxProfit < prices[i] - minPrice) {
        maxProfit = prices[i] - minPrice;
        candidateSell = i;
        ret[0] = candidateBuy;
        ret[1] = candidateSell;
      }
    }
    
    return ret;
  }

}
