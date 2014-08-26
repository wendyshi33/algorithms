package algorithm.basic;

import java.util.*;

public class BinaryTreePostorderIterator{
  
  public static class Node {
    int val;
    Node left;
    Node right;
  
    public Node(int val) {
      this.val = val;
    }
  }
  
  private Stack<Node> stack;
  
  public BinaryTreePostorderIterator(Node node) {
    this.stack = new Stack<Node>();
    if (node != null) {
      this.addNodes(node);
    }
  }
  
  private void addNodes(Node node) {
    Node cur = node;
    while (cur != null) {
      this.stack.push(cur);
      if (cur.left != null) {
        cur = cur.left;
      } else {
        cur = cur.right;
      }
    }
  }
  
  public Node next() {
    if (stack.isEmpty()) {
      return null;
    }
    Node cur = stack.pop();
    if (!stack.isEmpty() && stack.peek().left == cur && stack.peek().right != null) {
      this.addNodes(stack.peek().right);
    }
    return cur;
  }
  
}
