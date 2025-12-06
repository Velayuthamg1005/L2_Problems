/*
   Problem: Missing Number
   You are given an array containing numbers from 0 to n, but exactly one number is missing.
   Return the missing number.

   Concept:
   XOR all numbers from 0 to n,
   XOR all elements in the array,
   Remaining value = missing number.

   Sample Test Cases:
   ------------------
   Input:  [3, 0, 1]
   Output: 2

   Input:  [0, 1]
   Output: 2

   Input:  [9, 6, 4, 2, 3, 5, 7, 0, 1]
   Output: 8

   Note:
   XOR method works because:
   - a ^ a = 0  (pairs cancel out)
   - a ^ 0 = a
*/

package numbers;

public class MissingNumber {
    public static void main(String[] args) {

        int[] input1 = {3, 0, 1};
        int[] input2 = {0, 1};
        int[] input3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Result: " + missingNumber(input1));
        System.out.println("Result: " + missingNumber(input2));
        System.out.println("Result: " + missingNumber(input3));
    }

    public static int missingNumber(int[] input) {

        int n = input.length;

        int XOR1 = 0;
        for (int i = 0; i <= n; i++) {
            XOR1 ^= i;  // XOR of all numbers from 0 to n
        }

        int XOR2 = 0;
        for (int num : input) {
            XOR2 ^= num;  // XOR of array elements
        }

        return XOR1 ^ XOR2;  // Missing number
    }
}
