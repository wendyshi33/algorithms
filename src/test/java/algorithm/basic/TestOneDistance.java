package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestOneDistance {
	
	@Test
	public void testOneDistance() {
		OneDistance od = new OneDistance();
		assertFalse(od.oneDistance("cat", "dog"));
		assertTrue(od.oneDistance("bag", "bug"));
		assertFalse(od.oneDistance("Internet", "Internet"));
		assertTrue(od.oneDistance("cat", "at"));
	}	
}
