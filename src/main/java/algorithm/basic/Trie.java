package algorithm.basic;

public class Trie {

	public static final int alphSize = 52;

	class TrieNode {
		private char curCh;
		private int numOfEnd;
		private TrieNode[] children;

		public TrieNode(char ch) {
			this.curCh = ch;
			this.numOfEnd = 0;	 // # strings end at this node
			this.children = new TrieNode[alphSize];
		}
	}

	private TrieNode root;

	public Trie() {
		root = new TrieNode('#');	
	}

	public void insert(String str) {
		TrieNode cur = root;
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (cur.children[ch - 'a'] == null) {
				cur.children[ch - 'a'] = new TrieNode(ch);
			}
			cur = cur.children[ch - 'a'];
			if (i == str.length() - 1) {
				++cur.numOfEnd;
			}
		}
	}

	public int find(String str) {
		TrieNode cur = root;
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (cur.children[ch - 'a'] == null) {
				return 0;
			}
			cur = cur.children[ch - 'a'];
			if (i == str.length() - 1) {
				if (cur.numOfEnd != 0) {
					return cur.numOfEnd;	
				} else {
					return 0;
				}
			}
		}
		return 0;
	}

}
