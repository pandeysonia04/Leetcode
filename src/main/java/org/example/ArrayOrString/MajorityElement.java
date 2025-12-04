package org.example.ArrayOrString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority=0, res=0;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], 1+map.getOrDefault(nums[i],0));
            if(map.get(nums[i])>majority)
            {
                res= nums[i];
                majority=map.get(nums[i]);
            }
        }
        return res;
    }
}
