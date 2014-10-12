package algorithm.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPointsOnALine {

  static class Point {
    int x;
    int y;

    Point() {
      x = 0;
      y = 0;
    }

    Point(int a, int b) {
      x = a;
      y = b;
    }
  }

  /**
   * Definition for a point.
   * class Point {
   *     int x;
   *     int y;
   *     Point() { x = 0; y = 0; }
   *     Point(int a, int b) { x = a; y = b; }
   * }
   *
   * Time complexity: O(N^2), space complexity O(N).
   */
  public class Solution {
    public int maxPoints(Point[] points) {
      if (points.length <= 2) {
        return points.length;
      }      

      int maxPoints = 0;
      List<Double> slopes = new ArrayList<Double>();

      for (int i = 0; i < points.length; ++i) {
        Point pa = points[i];
        slopes = new ArrayList<Double>();
        int duplicate = 0;
        for (int j = 0; j < points.length; ++j) {
          if (i != j) {
            Point pb = points[j];
            if (pa.x == pb.x && pa.y == pb.y) { // duplicate
              ++duplicate;
            } else if (pa.x == pb.x) {  // vertical
              slopes.add(Double.MAX_VALUE);
            } else {  // normal
              slopes.add((double)(pa.y - pb.y) / (pa.x - pb.x));
            }
          }
        }
        Collections.sort(slopes);
        if (slopes.size() == 0) {
          maxPoints = Math.max(maxPoints, duplicate + 1);
        } else {
          int pointsInALine = 2;
          for (int j = 1; j < slopes.size(); ++j) {
            if (Math.abs(slopes.get(j - 1) - slopes.get(j)) < 0.0001) { // in a same line
              ++pointsInALine;
            } else {
              maxPoints = Math.max(maxPoints, pointsInALine + duplicate);
              pointsInALine = 2;
            } 
          }
          maxPoints = Math.max(maxPoints, pointsInALine + duplicate);
        }

      }

      return maxPoints;
    }

  }

}
