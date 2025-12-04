package org.example.Intervals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertIntervals {
    public static void main(String[] args) {
        Solution solution = new Solution();
       int[][] result = solution.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});
        System.out.println(Arrays.deepToString(result));
        
    }
    static class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int[][] result = new int[intervals.length+1][2];
            int i=0, j=0;

            //Add non-overlapping intervals till the overlapping interval doesn't arrive
            while(i<intervals.length && intervals[i][1]<newInterval[0]){
                result[j++]=intervals[i++];
            }

            //Merge the overlapping interval
            while(i<intervals.length && intervals[i][0]<=newInterval[1]){
                newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
                newInterval[1]=Math.max(intervals[i++][1],newInterval[1]);
            }
            result[j++]=newInterval;

            //As there is only 1 interval that needs to be inserted, so instead of checking overlapping on others
            //we can directly add the remaining intervals
            while(i<intervals.length){
                result[j++]=intervals[i++];
            }

            return Arrays.copyOf(result,j);
        }
        }
}
