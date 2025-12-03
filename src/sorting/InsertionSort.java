/*
 * Problem: Insertion Sort
 * Description: Sorts an array by repeatedly inserting elements into their
 *              correct position in the sorted left portion.
 *
 * Level: Easy
 * Topic: Sorting Algorithm
 * Date Solved: 03-12-2025
 * Source: Self
 *
 * Time Complexity:
 *      Best  : O(n)
 *      Worst : O(n^2)
 *      Avg   : O(n^2)
 *
 * Space Complexity: O(1)
 *
 * Approach:
 * - Iterate from index 1.
 * - Take arr[i] as key.
 * - Shift all elements greater than key to the right.
 * - Insert key at its correct location.
 *
 * Example:
 * Input : [12, 11, 13, 5, 6]
 * Output: [5, 6, 11, 12, 13]
 */

package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Result: " + Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // shift bigger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }

        return arr;
    }
}
