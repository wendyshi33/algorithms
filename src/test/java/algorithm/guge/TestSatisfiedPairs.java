package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSatisfiedPairs {

  @Test
  public void testSatisfiedPairs() {
    SatisfiedPairs pairs = new SatisfiedPairs();
    int[] arr1 = {1, 2, 5, 8, 10, 12};
    int target1 = 11;
    int exp1 = 6;
    assertEquals(exp1, pairs.numSatisfiedPairs(arr1, target1));

    int[] arr2 = {1, 2, 3, 5, 6, 7, 8};
    int target2 = 11;
    int exp2 = 16;
    assertEquals(exp2, pairs.numSatisfiedPairs(arr2, target2));

    int[] arr3 = {2, 4, 6, 9};
    int target3 = 5;
    int exp3 = 0;
    assertEquals(exp3, pairs.numSatisfiedPairs(arr3, target3));
  }
 
}
