package algorithm.lc;

public class InsertionSortList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// O(1) space, O(n^2) time
	public class Solution {
		public ListNode insertionSortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode newHead = new ListNode(0);
			newHead.next = head;
			ListNode sortedHead = head;
			ListNode remainingHead = head.next; 
			head.next = null;

			while (remainingHead != null) { // while there is node not sorted
				ListNode sortedPrev = newHead;
				while (sortedPrev.next != null && sortedPrev.next.val < remainingHead.val) {
					sortedPrev = sortedPrev.next;
				}
				ListNode newRemainingHead = remainingHead.next;
				if (sortedPrev.next == null) { // append to the tail of sorted list
					remainingHead.next = null;
					sortedPrev.next = remainingHead;
				} else { // insert into sorted list
					remainingHead.next = sortedPrev.next;
					sortedPrev.next = remainingHead;
				}
				remainingHead = newRemainingHead;
			}
			return newHead.next;
		}
	}	
}
