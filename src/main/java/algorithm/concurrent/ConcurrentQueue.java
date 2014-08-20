package algorithm.concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implementing a concurrent queue. A simplified version of BlockingQueue in JDK.
 *
 */
public class ConcurrentQueue<V> {
  
  private Queue<V> queue;
  private ReentrantLock lock;
  private Condition notEmpty;
  
  public ConcurrentQueue() {
    this.queue = new LinkedList<V>();
    this.lock = new ReentrantLock();
    this.notEmpty = this.lock.newCondition();
  }
  
  public void offer(V v) {
    lock.lock();
    try {
      queue.offer(v);
      if (queue.size() == 1) {
        signalNotEmpty(); // notify the waiting thread
      }
    } finally {
      lock.unlock();
    }
  }
  
  /**
   * If queue is empty, return null
   * @return
   */
  public V poll() {
    V v = null;
    lock.lock();
    try {
      v = queue.poll();
    } finally {
      lock.unlock();
    }
    return v;
  }
  
  /**
   * If queue is empty, then wait.
   * @return
   * @throws InterruptedException 
   */
  public V take() throws InterruptedException {
    V v;
    lock.lockInterruptibly();
    try {
      while (queue.size() == 0) {
        notEmpty.await();
      }
      v = queue.poll();
      if (queue.size() > 0) {
        notEmpty.signal();
      }
    } finally {
      lock.unlock();
    }
    return v;
  }
  
  public int size() {
    int size;
    lock.lock();
    try {
      size = queue.size();
    } finally {
      lock.unlock();
    }
    return size;
  }
  
  public V peek() {
    V v;
    lock.lock();
    try {
      v = queue.peek();
    } finally {
      lock.unlock();
    }
    return v;
  }
  
  private void signalNotEmpty() {
    lock.lock();
    try {
      notEmpty.signal();
    } finally {
      lock.unlock();
    }
  }
  

}
