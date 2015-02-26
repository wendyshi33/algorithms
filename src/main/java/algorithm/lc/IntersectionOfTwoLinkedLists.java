package algorithm.lc;

import java.util.*;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 *
 * A:          a1 → a2
 *                    ↘
 *                     c1 → c2 → c3
 *                    ↗            
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 *
 */

public class IntersectionOfTwoLinkedLists {

  class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
      val = x;
      next = null; 
    }
  }


  public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int lenA = 0, lenB = 0;

      ListNode curNode = headA;
      while (curNode != null) {
        curNode = curNode.next;
        ++lenA;
      }

      curNode = headB;
      while (curNode != null) {
        curNode = curNode.next;
        ++lenB;
      }

      ListNode longerList = headA, shorterList = headB;
      int longerLen = lenA, shorterLen = lenB;
      if (lenA < lenB) {
        longerLen = lenB;
        shorterLen = lenA;
        longerList = headB;
        shorterList = headA;
      }

      for (int i = 0; i < longerLen - shorterLen; ++i) {
        longerList = longerList.next;
      }

      while (shorterList != null) {
        if (longerList.val == shorterList.val) {
          return longerList;
        }
        longerList = longerList.next;
        shorterList = shorterList.next;
      }

      return null;
    }
  }
}
