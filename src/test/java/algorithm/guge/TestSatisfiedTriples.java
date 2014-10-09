package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSatisfiedTriples {

  @Test
  public void testSatisfiedTriples() {
    SatisfiedTriples triples = new SatisfiedTriples();
    int[] arr1 = {1, 2, 5, 8, 10, 12};
    int target1 = 16;
    int exp1 = 7;
    assertEquals(exp1, triples.numSatisfiedTriples(arr1, target1));
    
    int[] arr2 = {1, 2, 3, 5, 6, 7, 8};
    int target2 = 11;
    int exp2 = 10;
    assertEquals(exp2, triples.numSatisfiedTriples(arr2, target2));
    
    int[] arr3 = {2, 4, 6, 9};
    int target3 = 5;
    int exp3 = 0;
    assertEquals(exp3, triples.numSatisfiedTriples(arr3, target3));

  }

}
