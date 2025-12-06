/*
   Problem: Happy Number
   A number is called "happy" if:
   - You repeatedly replace the number with the sum of the squares of its digits
   - You eventually reach 1
   - If the process loops endlessly (repeats numbers), it is NOT happy

   Sample Test Cases:
   ------------------
   Input: 19
   Output: true
   Explanation:
     1² + 9² = 82
     8² + 2² = 68
     6² + 8² = 100
     1² + 0² + 0² = 1 → Happy

   Input: 2
   Output: false
   Explanation:
     Reaches the cycle: 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 → ...
     Never reaches 1 → Not happy
*/

package numbers;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        int input1 = 19;
        int input2 = 2;

        System.out.println("Result: " + isHappyNumber(input1)); // true
        System.out.println("Result: " + isHappyNumber(input2)); // false
    }

    public static boolean isHappyNumber(int input) {

        HashSet<Integer> seen = new HashSet<>();

        while (!seen.contains(input)) {

            seen.add(input);
            int sum = 0;

            // Sum of squares of digits
            while (input != 0) {
                int rem = input % 10;
                sum += rem * rem;
                input /= 10;
            }

            input = sum; // move to next number in the process
        }

        return input == 1;  // true only if we ended at 1
    }
}
