package algorithm.basic;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestBurrowsWheelerTransform {

	@Test
	public void testBwt() {
		BurrowsWheelerTransform bwt = new BurrowsWheelerTransform();	
		String eof = "#";
		String s1 = "google";
		String r1 = "elo#gog";
		assertEquals(r1, bwt.bwt(s1, eof)); 
	}

	@Test
	public void testReverse() {
		BurrowsWheelerTransform bwt = new BurrowsWheelerTransform();
		String eof = "#";
		Random rnd = new Random();
		for (int i = 0; i < 10; ++i) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 10; ++j) {
				char ch = (char)('a' + rnd.nextInt(26));
				sb.append(ch);	
			}
			String encoded = bwt.bwt(sb.toString(), eof);
			assertEquals(sb.toString(), bwt.reverse(encoded, eof)); 
		}
	}
}
