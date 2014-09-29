package algorithm.linkedin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDepthOfStringRepresentation {

	@Test
	public void testDepthOfStringRepresentation() {
		DepthOfStringRepresentation depth = new DepthOfStringRepresentation();	

		assertEquals(0, depth.depth("(00)"));
		assertEquals(1, depth.depth("((00)0)"));
		assertEquals(1, depth.depth("((00)(00))"));
		assertEquals(2, depth.depth("((00)(0(00)))"));
		assertEquals(3, depth.depth("((00)(0(0(00))))"));
		assertEquals(-1, depth.depth("x"));
		assertEquals(-1, depth.depth("0"));
		assertEquals(-1, depth.depth("()"));
		assertEquals(-1, depth.depth("(0)"));
		assertEquals(-1, depth.depth("(00)0"));
		assertEquals(-1, depth.depth("(0(00)0)"));
	}
}
