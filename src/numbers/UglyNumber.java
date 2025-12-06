/*
   Problem: Ugly Number
   A number is called "ugly" if its prime factors include only 2, 3, and 5.

   Rules:
   - 1 is considered an ugly number.
   - Any number <= 0 is not ugly.
   - Keep dividing the number by 2, 3, and 5 as long as possible.
   - If the final number becomes 1 → it is ugly.

   Sample Test Cases:
   ------------------
   Input: 6
   Output: true   (6 -> divide by 2 -> 3 -> divide by 3 -> 1)

   Input: 1
   Output: true   (1 is always ugly)

   Input: 14
   Output: false  (Prime factor 7 is not allowed)
*/

package numbers;

public class UglyNumber {
    public static void main(String[] args) {

        int input1 = 6;
        int input2 = 1;
        int input3 = 14;

        System.out.println("Result: " + isUgly(input1));
        System.out.println("Result: " + isUgly(input2));
        System.out.println("Result: " + isUgly(input3));
    }

    public static boolean isUgly(int input) {

        if (input <= 0) {
            return false; // Ugly numbers must be positive
        }

        int[] primes = {2, 3, 5};

        for (int p : primes) {
            while (input % p == 0) {
                input /= p;  // Keep dividing by 2, 3, or 5
            }
        }

        return input == 1;  // After removing all 2,3,5 factors
    }
}
