package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCircularBuffer {

	@Test
	public void testCircularBuffer() {
		int size = 10;
		CircularBuffer cb = new CircularBuffer(size);	
		char[] buf1 = "abcde".toCharArray();
		assertEquals(0, cb.getLength());
		assertEquals(0, cb.getStart());
		cb.enqueue(buf1);
		assertEquals(5, cb.getLength());
		assertEquals(0, cb.getStart());

		char[] buf2 = new char[3];
		cb.dequeue(buf2);
		assertEquals(2, cb.getLength());
		assertEquals(3, cb.getStart());
		char[] buf3 = "zzzzzzz".toCharArray();
		cb.enqueue(buf3);
		assertEquals(9, cb.getLength());
		assertEquals(3, cb.getStart());

		char[] buf4 = new char[9];
		cb.dequeue(buf4);
		assertEquals(0, cb.getLength());
		assertEquals(2, cb.getStart());

		char[] buf5 = "qqq".toCharArray();
		cb.enqueue(buf5);
		assertEquals(3, cb.getLength());
		assertEquals(2, cb.getStart());
	}
}
