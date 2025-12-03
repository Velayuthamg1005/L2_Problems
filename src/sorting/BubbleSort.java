/*
 * Problem: Bubble Sort
 * Description: Sort an array by repeatedly comparing adjacent elements
 *              and swapping them if they are in the wrong order.
 *
 * Level: Easy
 * Topic: Sorting Algorithm
 * Date Solved: 03-12-2025
 * Source: Self
 *
 * Time Complexity:
 *      Worst Case: O(n^2)
 *      Best Case : O(n)  (when already sorted due to early stopping)
 *      Average   : O(n^2)
 *
 * Space Complexity: O(1)  // In-place sorting
 *
 * Approach:
 * - Use nested loops.
 * - In each pass, compare arr[j] with arr[j+1] and swap if needed.
 * - After each pass, the largest element bubbles to the end.
 * - Optimization: If no swaps occur in a pass, array is already sorted → break early.
 *
 * Example:
 * Input : [64, 34, 25, 12, 22, 11, 90]
 * Output: [11, 12, 22, 25, 34, 64, 90]
 */

package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Result : " + Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // to check if any swap happened

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // No swaps → array already sorted
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
