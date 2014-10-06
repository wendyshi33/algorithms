package algorithm.qichuangzaocan;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBurglarizingHouse {
	
	@Test
	public void testBurglarizingHouse() {
		BurglarizingHouse house = new BurglarizingHouse();
		int[] arr = {2, 4, 5, 7, 1, 8, 5};
    List<Integer> res1 = Arrays.asList(new Integer[] {1, 3, 5}); 
		assertEquals(res1, house.bestValue(arr));

		int[] arr2 = {1, 9, 1, 1, 8, 1};
    List<Integer> res2 = Arrays.asList(new Integer[] {1, 4});
		assertEquals(res2, house.bestValue(arr2));

		int[] arr3 = {1};
    List<Integer> res3 = Arrays.asList(new Integer[] {0});
		assertEquals(res3, house.bestValue(arr3));

		int[] arr4 = {2, 1};
    List<Integer> res4 = Arrays.asList(new Integer[] {0});
		assertEquals(res4, house.bestValue(arr4));

		int[] arr5 = {1, 1, 1, 1, 1};
    List<Integer> res5 = Arrays.asList(new Integer[] {0, 2, 4});
		assertEquals(res5, house.bestValue(arr5));
	}

}
