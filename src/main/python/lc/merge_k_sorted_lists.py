# Definition for singly-linked list.
class ListNode:
  def __init__(self, x):
    self.val = x
    self.next = None

class Solution:
  # @param a list of ListNode
  # @return a ListNode
  def mergeKLists(self, lists):
    new_head = ListNode(0)
    cur = new_head

    while True:
      idx = -1
      min_val = 2**31
      for i in range(len(lists)):
        if lists[i] is not None and lists[i].val < min_val:
          idx, min_val = i, lists[i].val
      if idx == -1:
        return new_head.next
      cur.next = lists[idx]
      cur = cur.next
      lists[idx] = lists[idx].next

if __name__ == '__main__':
  lists = [[1]] 
  s = Solution()
  res = s.mergeKLists(lists)
  while res is not None:
    print(res.val)
    res = res.next
