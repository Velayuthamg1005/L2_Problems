/*
   Problem: Check if a Number is a Palindrome
   A number is a palindrome if it reads the same forwards and backwards.

   Sample Test Cases:
   ------------------
   Input:  121
   Output: true

   Input:  -121
   Output: false   (negative numbers are not palindrome)

   Input:  10
   Output: false   (reverse is 01)

   Input:  0
   Output: true
*/

package numbers;

public class PalindromeNumber {
    public static void main(String[] args) {

        int input1 = 121;
        int input2 = -121;
        int input3 = 10;

        System.out.println("Result: " + findPalindrome(input1));
        System.out.println("Result: " + findPalindrome(input2));
        System.out.println("Result: " + findPalindrome(input3));
    }

    public static boolean findPalindrome(int input) {

        int temp = input;
        int rem = 0;
        int rev = 0;

        // Negative numbers cannot be palindrome
        if (input < 0) {
            return false;
        }

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        return input == rev;
    }
}
