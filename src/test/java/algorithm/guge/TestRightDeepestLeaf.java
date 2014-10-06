package algorithm.guge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRightDeepestLeaf {
	
	@Test
	public void testFindRightDeepestLeaf() {

		RightDeepestLeaf rightDeepest = new RightDeepestLeaf();

		TreeNode root = new TreeNode(0);
		TreeNode first = new TreeNode(1);	
		TreeNode second = new TreeNode(2);	
		TreeNode third = new TreeNode(3);	
		TreeNode fourth = new TreeNode(4);	
		TreeNode fifth = new TreeNode(5);	
		TreeNode sixth = new TreeNode(6);	
		TreeNode seventh = new TreeNode(7);	
		TreeNode eighth = new TreeNode(8);	
		TreeNode ninth = new TreeNode(9);
		TreeNode tenth = new TreeNode(10);
		TreeNode eleventh = new TreeNode(11);

		root.left = first;
		root.right = second;
		first.left = third;
		first.right = fourth;
		second.left = fifth;
		second.right = sixth;
		fourth.left = seventh;
		seventh.left = ninth;
		fifth.right = eighth;

		assertEquals(ninth, rightDeepest.findRightDeepestLeaf(root));

		sixth.right = tenth;
		tenth.left = eleventh;

		assertEquals(eleventh, rightDeepest.findRightDeepestLeaf(root));
	}
}
