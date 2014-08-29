package algorithm.basic;

import java.io.*;
import java.util.*;

/*
 *	Find out a solution that the sum of a subarray equals to a target value. 
 * 	O(N) space, O(N) time.
 */

class SubarraySum {
  
  public int[] subsum(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
      return new int[0];
    }
    
    int[] b = new int[arr.length];
    b[0] = arr[0];
    for (int i = 1; i < arr.length; ++i) {
      b[i] = b[i - 1] + arr[i];
      if (b[i] == target) {
        return Arrays.copyOfRange(arr, 0, i + 1);
      }
    }
    
    Map<Integer, Integer> idx = new HashMap<Integer, Integer>();
    for (int i = 0; i < b.length; ++i) {
      Integer largerIdx = idx.get(b[i] + target);
      if (largerIdx != null && largerIdx < i) {
        return Arrays.copyOfRange(arr, largerIdx + 1, i + 1);
      }
      Integer smallerIdx = idx.get(b[i] - target);
      if (smallerIdx != null && smallerIdx < i) {
        return Arrays.copyOfRange(arr, smallerIdx + 1, i + 1);
      }
      idx.put(b[i], i);
    }
    
    return new int[0];
  }
  
}
