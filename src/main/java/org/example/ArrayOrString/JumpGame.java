package org.example.ArrayOrString;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        boolean result = jumpGame.canJump(new int[]{2,3,1,1,4});
        System.out.println("Jump Game Result: "+result);
    }
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i]>=goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}
