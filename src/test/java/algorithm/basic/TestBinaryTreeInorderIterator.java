package algorithm.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinaryTreeInorderIterator {
	
	@Test
	public void testTree() {
		BinaryTreeInorderIterator.Node root = new BinaryTreeInorderIterator.Node(0);
		BinaryTreeInorderIterator.Node l = new BinaryTreeInorderIterator.Node(1);
		BinaryTreeInorderIterator.Node r = new BinaryTreeInorderIterator.Node(2);
		BinaryTreeInorderIterator.Node ll = new BinaryTreeInorderIterator.Node(3);
		BinaryTreeInorderIterator.Node lr = new BinaryTreeInorderIterator.Node(4);
		BinaryTreeInorderIterator.Node rl = new BinaryTreeInorderIterator.Node(5);
		BinaryTreeInorderIterator.Node rr = new BinaryTreeInorderIterator.Node(6);
		root.left = l;
		root.right = r;
		l.left = ll;
		l.right = lr;
		r.left = rl;
		r.right = rr;

		BinaryTreeInorderIterator itr = new BinaryTreeInorderIterator(root);
		assertEquals(3, itr.next().val);
		assertEquals(1, itr.next().val);
		assertEquals(4, itr.next().val);
		assertEquals(0, itr.next().val);
		assertEquals(5, itr.next().val);
		assertEquals(2, itr.next().val);
		assertEquals(6, itr.next().val);
	}
}
