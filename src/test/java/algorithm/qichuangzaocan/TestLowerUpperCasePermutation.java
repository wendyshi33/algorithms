package algorithm.qichuangzaocan;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestLowerUpperCasePermutation {

	@Test
	public void testLowerUpperCasePermutation() {
		LowerUpperCasePermutation perm = new LowerUpperCasePermutation();

		String str1 = "Abc";
		String[] exp1 = new String[] {
			"ABC", "ABc", "AbC", "Abc", "aBC", "aBc", "abC", "abc"
		};
		List<String> res1 = perm.lowerUpperCasePermutation(str1);
		assertArrayEquals(exp1, res1.toArray());

		String str2 = "oK";
		String[] exp2 = new String[] {"OK", "Ok", "oK", "ok"};
		List<String> res2 = perm.lowerUpperCasePermutation(str2);
		assertArrayEquals(exp2, res2.toArray());
	}

}
