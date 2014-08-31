package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBurglarizingHouse {
	
	@Test
	public void testBurglarizingHouse() {
		BurglarizingHouse house = new BurglarizingHouse();
		int[] arr = {2, 4, 5, 7, 1, 8, 5};
		assertEquals(19, house.bestValue(arr));
		int[] arr2 = {1, 9, 1, 1, 8, 1};
		assertEquals(17, house.bestValue(arr2));
	}

}
