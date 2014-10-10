package algorithm.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBinaryTreePostorderIterator {

	@Test
	public void testTree() {
		BinaryTreePostorderIterator.Node root = new BinaryTreePostorderIterator.Node(0);
		BinaryTreePostorderIterator.Node l = new BinaryTreePostorderIterator.Node(1);
		BinaryTreePostorderIterator.Node r = new BinaryTreePostorderIterator.Node(2);
		BinaryTreePostorderIterator.Node ll = new BinaryTreePostorderIterator.Node(3);
		BinaryTreePostorderIterator.Node lr = new BinaryTreePostorderIterator.Node(4);
		BinaryTreePostorderIterator.Node rl = new BinaryTreePostorderIterator.Node(5);
		BinaryTreePostorderIterator.Node rr = new BinaryTreePostorderIterator.Node(6);
		root.left = l;
		root.right = r;
		l.left = ll;
		l.right = lr;
		r.left = rl;
		r.right = rr;

		BinaryTreePostorderIterator itr = new BinaryTreePostorderIterator(root);
		assertEquals(3, itr.next().val);
		assertEquals(4, itr.next().val);
		assertEquals(1, itr.next().val);
		assertEquals(5, itr.next().val);
		assertEquals(6, itr.next().val);
		assertEquals(2, itr.next().val);
		assertEquals(0, itr.next().val);

		BinaryTreePostorderIterator.Node zero = new BinaryTreePostorderIterator.Node(0);
		BinaryTreePostorderIterator.Node one = new BinaryTreePostorderIterator.Node(1);
		BinaryTreePostorderIterator.Node two = new BinaryTreePostorderIterator.Node(2);
		BinaryTreePostorderIterator.Node three = new BinaryTreePostorderIterator.Node(3);
		BinaryTreePostorderIterator.Node four = new BinaryTreePostorderIterator.Node(4);
		BinaryTreePostorderIterator.Node five = new BinaryTreePostorderIterator.Node(5);

    zero.left = one;
    zero.right = two;
    one.left = three;
    one.right = four;
    two.right = five;
    itr = new BinaryTreePostorderIterator(zero);
    assertEquals(3, itr.next().val);
    assertEquals(4, itr.next().val);
    assertEquals(1, itr.next().val);
    assertEquals(5, itr.next().val);
    assertEquals(2, itr.next().val);
    assertEquals(0, itr.next().val);
	}	

}
