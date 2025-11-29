package PYQ;

/*
  Problem: Find the Second Largest Element in an Array

  Example Test Cases:
  -------------------
  Input:  [12, 35, 1, 10, 34, 1]
  Output: 34

  Input:  [10, 10, 10]
  Output: -1   (No second largest)

  Input:  [-5, -2, -9]
  Output: -5

  Input:  [5]
  Output: -1   (Only one element)

  Input:  [2, 1]
  Output: 1
*/

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr1={12, 35, 1, 10, 34, 1};
        int[] arr2={10, 10, 10};
        System.out.println("Second Largest: "+findSecondLargest(arr1));
        System.out.println("Second Largest: "+findSecondLargest(arr2));

    }

    public static int findSecondLargest(int[] arr){

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num<largest && num>secondLargest) {
                secondLargest=num;
            }
        }
        return secondLargest==Integer.MIN_VALUE ? -1 :secondLargest;
    }
}
