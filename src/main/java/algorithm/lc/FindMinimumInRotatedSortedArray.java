package algorithm.lc;

/**
 *  Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 *  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 *  Find the minimum element.
 * 
 *  You may assume no duplicate exists in the array.
 *
 *  Time complexity: O(logN)
 */
public class Solution {
  public int findMin(int[] num) {
    int first = 0, last = num.length - 1;
    int min = Integer.MAX_VALUE;
    
    while (first <= last) {
      int mid = (first + last) / 2;
      min = Math.min(min, num[mid]);
      if (num[first] < num[mid]) {  // left is sorted, check the first and search on right subarray
        min = Math.min(min, num[first]);
        first = mid + 1;
      } else {  // right is sorted, check the first in right subarray and search on left subarray
        if (mid + 1 < num.length) {
          min = Math.min(min, num[mid + 1]);
        }
        last = mid - 1;
      }
    }
    
    return min;
  }
}
