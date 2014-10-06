package algorithm.qichuangzaocan;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestKEditDistance {
	
	@Test
	public void testKEditDistance() {
	  KEditDistance ke = new KEditDistance();
		String target1 = "abc";
		int k1 = 2;
		List<String> list1 = new ArrayList<String>(Arrays.asList(new String[] {
			"abc", "ab", "ac", "bc", "abd", "bcd", "efg", "hij"
		}));
		Set<String> exp1 = new HashSet<String>(Arrays.asList(new String[] {
			"abc", "ab", "ac", "bc", "abd", "bcd"
		}));

		assertTrue(exp1.equals(ke.kDistance(target1, list1, k1)));
	}		
}
