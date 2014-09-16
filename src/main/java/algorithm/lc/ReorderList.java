package algorithm.lc;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln, reorder it to:
 * L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 
 * You must do this in-place without altering the nodes' values.
 * 
 * For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 */
public class ReorderList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	/**
	 * O(n) time, O(1) space. 
	 *
	 */
	public class Solution {
		public void reorderList(ListNode head) {
			if (head == null || head.next == null) {
				return;
			}
			// split list into half
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			ListNode firstHalf = head;
			ListNode cur = slow.next;
			slow.next = null;

			// reverse second half
			ListNode prev = null;
			while (cur != null) {
				ListNode next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			ListNode secondHalf = prev;

			// merge two list      
			ListNode newHead = new ListNode(0);
			cur = newHead;
			boolean addFirst = true;
			while (firstHalf != null || secondHalf != null) {
				if (addFirst) {
					cur.next = firstHalf;
					firstHalf = firstHalf.next;
				} else {
					cur.next = secondHalf;
					secondHalf = secondHalf.next;
				}
				addFirst = !addFirst;
				cur = cur.next;
			}
			head = newHead.next;
		}
	}

}
