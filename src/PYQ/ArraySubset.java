package PYQ;

import java.util.Arrays;

public class ArraySubset {
    public static void main(String[] args) {

        int[] arr1={10, 5, 2, 23, 19};
        int[] arr2={19, 5, 3};

        int[] arr3={1, 2, 3, 4, 4, 5, 6};
        int[] arr4={1, 2, 4};

        System.out.println("Is ArraySubset ? : "+findArraySubset(arr1,arr2));

    }

    public static boolean findArraySubset(int[] arr1,int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else {
                return false;
            }
        }

        return j==arr2.length;
    }
}
