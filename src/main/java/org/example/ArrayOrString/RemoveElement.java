package org.example.ArrayOrString;

public class RemoveElement {
    int j=0, k=0;
    public int removeElement(int[] nums, int val) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                k++;
                nums[j++]=nums[i];
            }
        }
        return k;
    }
}
