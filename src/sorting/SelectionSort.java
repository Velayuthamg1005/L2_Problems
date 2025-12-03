/*
 * Problem: Selection Sort
 * Description: Sort an array by selecting the minimum element from the
 *              unsorted part and placing it at the correct index.
 *
 * Level: Easy
 * Topic: Sorting Algorithm
 * Date Solved: 03-12-2025
 * Source: Self
 *
 * Time Complexity:
 *      Worst Case: O(n^2)
 *      Best Case : O(n^2)
 *      Average   : O(n^2)
 *
 * Space Complexity: O(1)  // In-place
 *
 * Approach:
 * - For each index i, assume arr[i] is the minimum.
 * - Search through the remaining array to find the true minimum.
 * - Swap arr[i] with the minimum found.
 * - Repeat for all positions.
 *
 * Example:
 * Input : [29, 10, 14, 37, 13]
 * Output: [10, 13, 14, 29, 37]
 */

package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Result : " + Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;  // assume first element is smallest

            // find the actual smallest
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap only if needed
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }
}
