package org.example.ArrayOrString;

import org.example.ArrayOrString.ProductOfArrayExceptSelf;

public class ProductOfArrayExecptSelfMain {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
