package org.example.ArrayOrString;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray= new RemoveDuplicateFromSortedArray();
        int unique = removeDuplicateFromSortedArray.removeDuplicates(new int[]{1,1,1,2,2,3});
        System.out.println("Unique Elements :"+unique);
    }
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1])
                nums[j++]=nums[i];
        }
        return j;
    }
}
