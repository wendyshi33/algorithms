package algorithm.airbnb;

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
		int[] arr3 = {1};
		assertEquals(1, house.bestValue(arr3));
		int[] arr4 = {2, 1};
		assertEquals(2, house.bestValue(arr4));
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(3, house.bestValue(arr5));
	}

}
