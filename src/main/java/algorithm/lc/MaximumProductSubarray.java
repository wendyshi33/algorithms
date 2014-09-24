package algorithm.lc;

/**
 *  Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 *  For example, given the array [2,3,-2,4],
 *  the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {
	/**
	 *  Any subarray that does not contain 0 can be the candidate of 
	 *  the maximum product subarray.  
	 *
	 *  Time complexity O(n), space complexity O(1).
	 */
	public class Solution {
		public int maxProduct(int[] A) {
			int max = Integer.MIN_VALUE;
			int prod = 1;
			for (int i : A) {
				prod *= i;
				max = Math.max(max, prod);
				if (i == 0) {
					prod = 1;
				}
			}      

			prod = 1;
			for (int i = A.length - 1; i >= 0; --i) {
				prod *= A[i];
				max = Math.max(max, prod);
				if (A[i] == 0) {
					prod = 1;
				}
			}
			return max;
		}
	}
}
