package org.example.ArrayOrString;

public class JumpGameII {
    public static void main(String[] args) {
        JumpGameII jumpGameII = new JumpGameII();
        int totalJumps = jumpGameII.jump(new int[]{2,3,1,1,4});
        System.out.println("Total number of jumps to reach destination: "+totalJumps);
    }
    public int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length-1;
        int coverage = 0;
        int lastJumpIndex= 0;
        if(nums.length == 1)
            return 0;
        for(int i=0; i<destination; i++){
            coverage = Math.max(coverage, i+nums[i]);
            if(i==lastJumpIndex){
                lastJumpIndex=coverage;
                totalJumps++;
                if(coverage>=destination)
                    return totalJumps;
            }
        }
        return totalJumps;
    }
}
