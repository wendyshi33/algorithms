package algorithm.tuding;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWeightedRandomSampling {
	
	@Test
	public void testWeightedRandomSampling() {
		Map<Integer, Double> probs = new HashMap<Integer, Double>();
		probs.put(1, 0.2);
		probs.put(2, 0.3);
		probs.put(3, 0.12);
		probs.put(4, 0.18);
		probs.put(5, 0.11);
		probs.put(6, 0.09);

		WeightedRandomSampling sampling = new WeightedRandomSampling(probs);

		int count1 = 1000000;
		Map<Integer, Integer> res1 = new HashMap<Integer, Integer>();
		for (Map.Entry<Integer, Double> entry : probs.entrySet()) {
			res1.put(entry.getKey(), 0);
		}

		// simulate 1 million times
		for (int i = 0; i < count1; ++i) {
			int sample = sampling.randomSampling();
			res1.put(sample, res1.get(sample) + 1);	
		}

		// check the error
		for (Map.Entry<Integer, Integer> entry : res1.entrySet()) {
			int value = entry.getKey();
			int count = entry.getValue();
			double prob = (double)count / count1;
			assertEquals(probs.get(value), prob, 0.01);
		}
		
	}	
}
