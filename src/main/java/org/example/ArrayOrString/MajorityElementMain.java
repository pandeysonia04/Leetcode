package org.example.ArrayOrString;

import org.example.ArrayOrString.MajorityElement;

public class MajorityElementMain {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement.majorityElement(nums));
    }
}
