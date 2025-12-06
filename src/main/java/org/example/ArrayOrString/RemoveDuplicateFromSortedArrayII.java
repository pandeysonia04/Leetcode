package org.example.ArrayOrString;

public class RemoveDuplicateFromSortedArrayII {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArrayII removeDuplicateFromSortedArrayII = new RemoveDuplicateFromSortedArrayII();
        int uniqueElements= removeDuplicateFromSortedArrayII.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
        System.out.println(uniqueElements);
    }
    public int removeDuplicates(int[] nums) {
        int j=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i]!=nums[j-2])
                nums[j++]=nums[i];
        }
        return j;
    }
}

