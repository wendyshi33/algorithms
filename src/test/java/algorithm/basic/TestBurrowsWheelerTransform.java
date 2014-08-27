package algorithm.basic;

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
}
