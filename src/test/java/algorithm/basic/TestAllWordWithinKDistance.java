package algorithm.basic;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAllWordWithinKDistance {
	
	@Test
	public void testAllWordWithinKDistance() {
		AllWordWithinKDistance kdist = new AllWordWithinKDistance();
		String target = "catcat";
		String[] arr = {"catdog", "catcat", "catca", "catcatt", "catcut"};
		List<String> pool = new ArrayList<String>();
		Collections.addAll(pool, arr);
		List<String> res1 = kdist.findAllWords(target, pool, 0);
		assertEquals(1, res1.size());
		List<String> res2 = kdist.findAllWords(target, pool, 1);
		assertEquals(4, res2.size());
		List<String> res3 = kdist.findAllWords(target, pool, 6);
		assertEquals(5, res3.size());
	}
}
