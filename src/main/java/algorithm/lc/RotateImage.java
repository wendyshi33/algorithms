package algorithm.lc;

/**
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up: Could you do this in-place?
 * 
 */
// O(1) space, O(n^2) time
public class RotateImage {
  public void rotate(int[][] matrix) {
    for (int layer = 0; layer < matrix.length / 2; ++layer) {
      int start = layer;
      int end = matrix.length - layer - 1;
      for (; start < end; ++start) {
        int tmp = matrix[layer][start];
				// replace upper with left
        matrix[layer][start] = matrix[matrix.length - 1 - start][layer];
				// replace left with bottom
        matrix[matrix.length - 1 - start][layer] = matrix[matrix.length - 1 - layer][matrix.length - 1 - start];
				// replace bottom with right
        matrix[matrix.length - 1 - layer][matrix.length - 1 - start] = matrix[start][matrix.length - 1 - layer];
				// replace right with upper
        matrix[start][matrix.length - 1 - layer] = tmp;
      }
    }
  }
}
