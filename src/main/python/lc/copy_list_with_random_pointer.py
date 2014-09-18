# Definition for singly-linked list with a random pointer.
# class RandomListNode:
#     def __init__(self, x):
#         self.label = x
#         self.next = None
#         self.random = None

class Solution:
  # @param head, a RandomListNode
  # @return a RandomListNode
  def copyRandomList(self, head):
    node_map = {}
    return self.copy_node(head, node_map)
    
  def copy_node(self, node, node_map):
    if node is None:
      return None
    if node.label in node_map:
      return node_map[node.label]
    
    new_node = RandomListNode(node.label)
    node_map[node.label] = new_node
    new_node.next = self.copy_node(node.next, node_map)
    new_node.random = self.copy_node(node.random, node_map)
    return new_node
