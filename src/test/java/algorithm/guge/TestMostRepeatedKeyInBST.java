package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMostRepeatedKeyInBST {

  @Test
  public void testMostRepeatedKeyInBST() {
    MostRepeatedKeyInBST most = new MostRepeatedKeyInBST();

    BST bst = new BST();
    bst.insert(1);
    bst.insert(1);
    bst.insert(2);
    bst.insert(10);
    bst.insert(4);
    bst.insert(3);
    bst.insert(3);
    bst.insert(3);
    bst.insert(2);
    bst.insert(2);
    bst.insert(2);
    bst.insert(2);
    assertEquals(5, most.mostRepeatedBST(bst));
  } 
}
