package algorithm.basic;

import java.util.*;
import org.junit.Test;

public class TestMaxWithRandomPosition {
	public static void main(String[] args) {
		MaxWithRandomPosition max = new MaxWithRandomPosition();
    int[] arr = {0, -1, 6, 2, 6, 6};
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < 100000; ++i) {
      int idx = max.returnMax(arr);
      Integer count = map.get(idx);
      if (count == null) {
        count = 0;
      }
      map.put(idx, count + 1);
    }
  }
}
