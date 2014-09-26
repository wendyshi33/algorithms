package algorithm.lc;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4, return
 * 1->4->3->2->5->NULL.
 * 
 * Note: Given m, n satisfy the following condition: 1 ? m ? n ? length of list.
 * 
 *	Time complexity: O(N), space complexity O(1). 
 */
public class ReverseList2 {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
		public ListNode reverseBetween(ListNode head, int m, int n) {
			ListNode fakeHead = new ListNode(0);
			fakeHead.next = head;
			int len = n - m;
			ListNode before = fakeHead;
			for (int i = 0; i < m - 1; ++i) {
				before = before.next;
			}
			ListNode pre = null;
			ListNode reversedTail = before.next;
			ListNode cur = before.next;
			before.next = null;
			for (int i = 0; i <= n - m; ++i) {
				ListNode next = cur.next;
				cur.next = pre;
				pre = cur;
				cur = next;
			}

			reversedTail.next = cur;  // link the tail of the second half to the head of the third half
			before.next = pre;    // link the tail of first half to the head of the second half

			return fakeHead.next;
		}
	}

}
