package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTrie {
	
	@Test
	public void testTrie() {
		Trie trie = new Trie();
		String str1 = "abs";
		trie.insert(str1);
		assertEquals(1, trie.find(str1));
		assertEquals(0, trie.find("ab"));
		trie.insert(str1);
		assertEquals(2, trie.find(str1));

		String str2 = "absd";
		trie.insert(str2);
		assertEquals(1, trie.find(str2));
		assertEquals(2, trie.find(str1));
		assertEquals(0, trie.find("ab"));
	}
}
