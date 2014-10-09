package algorithm.gongxiangzuche;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestBestTimeToBuyAndSell {

  @Test
  public void testBestTime() {

    BestTimeToBuyAndSell best = new BestTimeToBuyAndSell();
  
    int[] arr1 = {10, 20, 30, 40, 30, 25, 5, 20, 24, 60, 100};
    int[] exp1 = {6, 10};
    assertArrayEquals(exp1, best.bestTime(arr1));

    int[] arr2 = {10, 20, 30, 40, 30, 25, 5, 20, 24, 60, 100, 1};
    int[] exp2 = {6, 10};
    assertArrayEquals(exp2, best.bestTime(arr2));

    int[] arr3 = {10, 20, 30, 40, 30, 25, 5, 20, 24, 60, 100, 1, 50};
    int[] exp3 = {6, 10};
    assertArrayEquals(exp3, best.bestTime(arr3));
  }
}
