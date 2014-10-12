package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFindFirstMissing {

  @Test
  public void testFindFirstMissing() {
    FindFirstMissing find = new FindFirstMissing();
    int[] arr1 = {5, 4, 3, 2, 0};
    assertEquals(1, find.missingPositive(arr1));
    int[] arr2 = {1, 2, 3, 4, 5, 0, 6, 8};
    assertEquals(7, find.missingPositive(arr2));
    int[] arr3 = {0, 2, 3, 5, 1, 4, 9, 6, 8, -1};
    assertEquals(7, find.missingPositive(arr3));
  }

} 
