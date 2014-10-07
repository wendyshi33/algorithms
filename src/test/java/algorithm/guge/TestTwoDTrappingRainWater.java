package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTwoDTrappingRainWater {

  @Test
  public void testTwoDTrappingRainWater() {
    TwoDTrappingRainWater td = new TwoDTrappingRainWater(); 

    int[][] mat1 = {
      {2, 2, 3},
      {3, 4, 2},
      {2, 3, 3}
    };
    assertEquals(0, td.twoDTrappingRainWater(mat1));

    int[][] mat2 = {
      {3, 2, 7},
      {5, 1, 4},
      {2, 2, 3},
      {7, 7, 7}
    };
    assertEquals(1, td.twoDTrappingRainWater(mat2));
  }

}
