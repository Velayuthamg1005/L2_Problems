/*
   Problem: Form the Largest Number from Array

   Given a list of non-negative integers, arrange them such that they form the largest number.

   Sample Test Cases:
   ------------------
   Input:  [3, 30, 34, 5, 9]
   Output: "9534330"

   Input:  [10, 2]
   Output: "210"

   Input:  [0, 0]
   Output: "0"
*/

package numbers;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {

        int[] nums1 = {3, 30, 34, 5, 9};
        int[] nums2 = {10, 2};

        System.out.println("Result: " + findLargest(nums1));
        System.out.println("Result: " + findLargest(nums2));
    }

    public static String findLargest(int[] nums) {

        int n = nums.length;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom comparator: arrange strings based on which combination forms larger value
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if highest is "0", the whole number is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String a : arr) {
            sb.append(a);
        }

        return sb.toString();
    }
}
