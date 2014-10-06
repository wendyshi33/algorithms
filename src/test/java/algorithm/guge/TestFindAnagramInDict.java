package algorithm.guge;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestFindAnagramInDict {
	
	@Test
	public void testFindAnagramInDict() {
		FindAnagramInDict find = new FindAnagramInDict();

		String[] pool1 = {"aloha", "loha", "loaah", "hallo", "aohal"};		
		String target1 = "aloha";
		List<String> expected1 = new ArrayList<String>();
		expected1.add("aloha");
		expected1.add("loaah");
		expected1.add("aohal");
		assertThat(expected1, is(find.findAnagramInDict(pool1, target1)));

		String target2 = "google";
		String[] pool2 = {"google", "googol", "ggoole", "gologe", "a", "b", "c"};
		List<String> expected2 = new ArrayList<String>();
		expected2.add("google");
		expected2.add("ggoole");
		expected2.add("gologe");
		assertThat(expected2, is(find.findAnagramInDict(pool2, target2)));
	}
}
