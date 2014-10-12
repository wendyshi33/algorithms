package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPowerOfThree {
	
	@Test
	public void testPowerOfThree() {
		PowerOfThree power = new PowerOfThree();

		assertTrue(power.isPowerOfThree(0));
		assertTrue(power.isPowerOfThree(1));
		assertTrue(!power.isPowerOfThree(2));
		assertTrue(power.isPowerOfThree(3));
		assertTrue(!power.isPowerOfThree(4));
		assertTrue(!power.isPowerOfThree(5));
		assertTrue(!power.isPowerOfThree(6));
		assertTrue(!power.isPowerOfThree(7));
		assertTrue(!power.isPowerOfThree(8));
		assertTrue(power.isPowerOfThree(9));
		assertTrue(!power.isPowerOfThree(10));
		assertTrue(!power.isPowerOfThree(11));
    assertTrue(!power.isPowerOfThree(18));
    assertTrue(!power.isPowerOfThree(21));
    assertTrue(!power.isPowerOfThree(24));
		assertTrue(power.isPowerOfThree(27));
		assertTrue(!power.isPowerOfThree(28));
		assertTrue(!power.isPowerOfThree(29));
		assertTrue(power.isPowerOfThree((int)Math.pow(3, 10)));
		assertTrue(!power.isPowerOfThree((int)Math.pow(3, 10) + 1));
	}
}
