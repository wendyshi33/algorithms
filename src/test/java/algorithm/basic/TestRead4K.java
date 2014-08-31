package algorithm.basic;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRead4K {

	@Test
	public void testRead4K() {
		Random rnd = new Random();
		for (int i = 0; i < 10; ++i) {
			Read4K read = new Read4K();
			int size = rnd.nextInt(10000);
			char[] buf = new char[size];

			int remainInBuf = size % 4096;
			assertEquals(size, read.read(size, buf));  
			assertEquals(remainInBuf, read.sizeInBuf());
		}
	}

}
