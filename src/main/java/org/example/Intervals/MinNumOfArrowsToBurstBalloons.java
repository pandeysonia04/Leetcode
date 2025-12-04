package org.example.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MinNumOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}});
    }
    static class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, Comparator.comparingInt(i->i[0]));
            int result = points.length;
            int[] prev = points[0];
            for(int i=1; i<points.length; i++){
               int[] curr= points[i];
               if(curr[0]<=prev[1]){
                   result--;
                   prev = new int[]{curr[0], Math.min(curr[1], prev[1])};
               }
               else{
                   prev = curr;
               }
            }
            return result;
        }
    }
}
