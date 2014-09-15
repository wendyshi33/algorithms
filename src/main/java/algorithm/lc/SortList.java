package algorithm.lc;

import java.util.Random;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 */
public class SortList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}   
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			fast = slow.next;
			slow.next = null;
			ListNode firstHalf = sortList(head);
			ListNode secondHalf = sortList(fast);
			return merge(firstHalf, secondHalf);
		}

		public ListNode merge(ListNode first, ListNode second) {
			ListNode newHead = new ListNode(0);
			ListNode cur = newHead;
			while (first != null || second != null) {
				if (first == null) {
					cur.next = second;
					second = second.next;
				} else if (second == null) {
					cur.next = first;
					first = first.next;
				} else {
					if (first.val <= second.val) {
						cur.next = first;
						first = first.next;
					} else {
						cur.next = second;
						second = second.next;
					}
				}
				cur = cur.next;
			}    

			return newHead.next;
		}
	}

}
