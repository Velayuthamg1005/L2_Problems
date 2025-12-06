/*
   Problem: Single Number
   Every element in the array appears exactly twice, except for one element
   which appears only once. Find that single number.

   Sample Test Cases:
   ------------------
   Input:  [4, 1, 2, 1, 2]
   Output: 4

   Input:  [2, 2, 1]
   Output: 1

   Input:  [1]
   Output: 1

   Note:
   XOR property helps:
   - a ^ a = 0
   - a ^ 0 = a
   - XORing all numbers cancels pairs and leaves the single number.
*/

package numbers;

public class SingleNumber {
    public static void main(String[] args) {

        int[] input1 = {4, 1, 2, 1, 2};
        int[] input2 = {2, 2, 1};
        int[] input3 = {1};

        System.out.println("Result: " + singleNumber(input1));
        System.out.println("Result: " + singleNumber(input2));
        System.out.println("Result: " + singleNumber(input3));
    }

    public static int singleNumber(int[] input) {

        int result = 0;

        for (int num : input) {
            result ^= num;   // XOR operation cancels out duplicate pairs
        }

        return result;
    }
}
