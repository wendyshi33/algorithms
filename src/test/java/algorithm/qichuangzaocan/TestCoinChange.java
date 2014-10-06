package algorithm.qichuangzaocan;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestCoinChange {

	@Test
	public void testCoinChange() {
		CoinChange change = new CoinChange();

		int[] coins1 = {1, 3, 4};
		int value1 = 6;
		int[] exp1 = {3, 3};
		assertArrayEquals(exp1, change.minCoins(value1, coins1));
		int[] coins2 = {1, 5, 10, 25};
		int value2 = 53;
		int[] exp2 = {25, 25, 1, 1, 1};
		assertArrayEquals(exp2, change.minCoins(value2, coins2));
	}	
}
