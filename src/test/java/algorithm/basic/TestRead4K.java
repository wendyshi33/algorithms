package algorithm.basic;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRead4K {

  @Test
  public void testRead4K() {
    Random rnd = new Random();
    // read a small amount of data
    for (int i = 0; i < 1; ++i) {
      Read4K read = new Read4K();
      int size = rnd.nextInt(500);
      byte[] buf = new byte[size];

      int remainInBuf = 4096 - size % 4096;
      assertEquals(size, read.read(size, buf));  
      assertEquals(remainInBuf, read.sizeInBuf());
    }

    // read a large amount of data
    for (int i = 0; i < 10; ++i) {
      Read4K read = new Read4K();
      int size = rnd.nextInt(50000);
      byte[] buf = new byte[size];

      int remainInBuf = 4096 - size % 4096;
      assertEquals(size, read.read(size, buf));  
      assertEquals(remainInBuf, read.sizeInBuf());
    }
  }

}
