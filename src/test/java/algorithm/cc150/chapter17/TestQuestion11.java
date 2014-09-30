package algorithm.cc150.chapter17;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestQuestion11 {
	
	@Test
	public void testQuestion11() {
		Question11 q11 = new Question11();
		Map<Integer, Double> res1 = new HashMap<Integer, Double>();	
		for (int i = 0; i < 7; ++i) {
			res1.put(i, 0.0);
		}

		int count1 = 1000000;
		for (int i = 0; i < count1; ++i) {
			int value = q11.rand7();
			res1.put(value, res1.get(value) + 1);	
		}

		for (Map.Entry<Integer, Double> entry : res1.entrySet()) {
			System.out.printf("%d: %.5f%%\n", entry.getKey(), entry.getValue() / count1);
			assertEquals(1.0 / 7, entry.getValue() / count1, 0.001);
		}

	}

}
