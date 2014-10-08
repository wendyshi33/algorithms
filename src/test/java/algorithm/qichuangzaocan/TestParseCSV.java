package algorithm.qichuangzaocan;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestParseCSV {

  @Test
  public void testParseCSV() {
    ParseCSV csv = new ParseCSV();
    String str1 = "john, smith, 118";
    String[] res1 = {"john", "smith", "118"};
    assertArrayEquals(res1, csv.parseCSV(str1));

    String str2 = "john\\,smith, harrison, 119";
    String[] res2 = {"john,smith", "harrison", "119"};
    assertArrayEquals(res2, csv.parseCSV(str2));
  }
}
