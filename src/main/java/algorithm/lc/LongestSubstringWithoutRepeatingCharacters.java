package algorithm.lc;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 */
// O(n) space, O(nlgn) time
public class LongestSubstringWithoutRepeatingCharacters {

	// two pointers with an tree map to store all the visited characters
	public class Solution {
		public int lengthOfLongestSubstring(String s) {
			Map<Character, Integer> charPos = new HashMap<Character, Integer>();

			int maxLen = 0;
			int start = 0;
			for (int end = 0; end < s.length(); ++end) {
				char cur = s.charAt(end);
				Integer pos = charPos.get(cur);

				if (pos != null) {  
					start = Math.max(start, pos + 1); // word appear before, update start
				} 

				maxLen = Math.max(maxLen, end - start + 1);  
				charPos.put(cur, end); // record the latest position of the character
			}      

			return maxLen;
		}
	} 

}
