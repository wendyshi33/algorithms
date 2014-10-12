package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSubstrAnagram {
  
  @Test
  public void testSubstrAnagram() {
    SubstrAnagram substr = new SubstrAnagram();
    String h1 = "cbbdacbb";
    String n1 = "cba";
    String e1 = "acb";
    assertEquals(e1, substr.substrAnagram(h1, n1));

    String h2 = "cbbacbb";
    String n2 = "cbab";
    String e2 = "cbba";
    assertEquals(e2, substr.substrAnagram(h2, n2));

    String h3 = "ccaddsssa";
    String n3 = "asdsd";
    String e3 = "addss";
    assertEquals(e3, substr.substrAnagram(h3, n3));
  }

}
