package algorithm.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class WordBreakII {
  
  /**
   * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.
   *
   * Return all such possible sentences.
   *
   * For example, given
   * s = "catsanddog",
   * dict = ["cat", "cats", "and", "sand", "dog"].
   * 
   * A solution is ["cats and dog", "cat sand dog"].
   *
   * Time complexity:     Space complexity: O(N).
   *
   */
  public class Solution {
    public List<String> wordBreak(String s, Set<String> dict) {
      List<String> res = new ArrayList<String>();
      StringBuilder cur = new StringBuilder();
      boolean[] cache = new boolean[s.length() + 1];
      Arrays.fill(cache, true);
      int start = 0;
      check(s, start, dict, cache, cur, res);
      return res;
    }

    private void check(String s, int start, Set<String> dict, boolean[] cache, StringBuilder cur, List<String> res) {
      if (start == s.length()) { // success
        res.add(cur.toString().trim());
      } else {
        for (int i = start; i < s.length(); ++i) {
          String curStr = s.substring(start, i + 1);
          if (dict.contains(curStr) && cache[i + 1]) { // cur string can be found
            int oldLen = cur.length();
            int oldResSize = res.size();
            cur.append(curStr + " ");
            check(s, i + 1, dict, cache, cur, res);
            cur.setLength(oldLen);
            if (res.size() == oldResSize) { // current decomposition is invalid
              cache[i + 1] = false;     
            }
          }
        }
      }

    }

  }  

}
