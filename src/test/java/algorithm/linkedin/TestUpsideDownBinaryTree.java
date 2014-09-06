package algorithm.recursive;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUpsideDownBinaryTree {

	@Test
	public void testUpsideDownBinaryTree() {
		UpsideDownBinaryTree.TreeNode zero = new UpsideDownBinaryTree.TreeNode(0);	
		UpsideDownBinaryTree.TreeNode one = new UpsideDownBinaryTree.TreeNode(1);
		UpsideDownBinaryTree.TreeNode two = new UpsideDownBinaryTree.TreeNode(2);
		UpsideDownBinaryTree.TreeNode three = new UpsideDownBinaryTree.TreeNode(3);
		UpsideDownBinaryTree.TreeNode four = new UpsideDownBinaryTree.TreeNode(4);
		UpsideDownBinaryTree.TreeNode five = new UpsideDownBinaryTree.TreeNode(5);
		UpsideDownBinaryTree.TreeNode six = new UpsideDownBinaryTree.TreeNode(6);
		UpsideDownBinaryTree.TreeNode seven = new UpsideDownBinaryTree.TreeNode(7);
		zero.left = one;
		zero.right = two;
		one.left = three;
		three.left = four;
		three.right = five;
		four.left = six;
		four.right = seven;

		UpsideDownBinaryTree upsideDown = new UpsideDownBinaryTree();
		UpsideDownBinaryTree.TreeNode res = upsideDown.upsideDownBinaryTree(zero);

		assertEquals(6, res.val);
		assertEquals(4, res.right.val);
		assertEquals(7, res.left.val);
		assertEquals(5, res.right.left.val);
		assertEquals(3, res.right.right.val);
		assertEquals(1, res.right.right.right.val);
		assertEquals(2, res.right.right.right.left.val);
		assertEquals(0, res.right.right.right.right.val);
	}
}
