package algorithm.guge;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestWeirdSort {

  @Test
  public void testWeirdSort() {
    WeirdSort sort = new WeirdSort();
    for (int i = 0; i < 100; ++i) {
      int[] arr = generateRandomArr(10);
      sort.sort(arr);
      assertArr(arr);
    }
  }

  private int[] generateRandomArr(int size) {
    int[] arr = new int[size];
    Random rnd = new Random();
    for (int i = 0; i < arr.length; ++i) {
      arr[i] = rnd.nextInt(100); 
    }
    return arr;
  }

  private void assertArr(int[] arr) {
    for (int i = 0; i < arr.length - 1; ++i) {
      if (i % 2 == 0) {
        assertTrue(arr[i] <= arr[i + 1]);
      } else {
        assertTrue(arr[i] >= arr[i + 1]);
      } 
    } 


  }

}
