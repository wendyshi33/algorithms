package algorithm.basic;

import java.io.*;
import java.util.*;

/**
 *	Read arbitrary size of data using read4k.
 */
public class Read4K {
  
	private static int size = 4096;
  private int dataInBuf;
  private char[] buffer;
  private int startInBuf;
  
  public Read4K() {
    this.dataInBuf = 0;
    this.buffer = new char[size];
    this.startInBuf = 0;
  }
  
  public int read4K(char[] buf) {
    // dummy
    return 4096;
  }
  
  public int read(int size, char[] buf) {
    int hasRead = 0;
    
    while (size != 0) {
      if (dataInBuf == 0) {
        dataInBuf = read4K(buffer);
        if (dataInBuf == 0) {
          break;
        }
        startInBuf = 0; // reset buffer
      }
      
      int batchSize = Math.min(size, dataInBuf);
      for (int i = 0; i < batchSize; ++i) {
        buf[hasRead + i] = buffer[i];
      }
      hasRead += batchSize;
      size -= batchSize;
      startInBuf += batchSize;
      dataInBuf -= batchSize;
    }
    
    return hasRead;
  }

	public int sizeInBuf() {
		return size - dataInBuf;	
	}
  
}
