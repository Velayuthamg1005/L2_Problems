package PYQ;

public class BitonicPoint {

    public static void main(String[] args) {

        int[] arr={1, 2, 4, 5, 7, 8, 3};
        System.out.println("Bitonic Point: "+findBitonicBruteForce(arr));
        System.out.println("Bitonic Point: "+findBitonic(arr));

    }

    // Brute Force - Linear Search

    public static int findBitonicBruteForce(int[] arr){

        int n= arr.length;

        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }

        return -1;
    }

    // Optimal Solution - Binary Search

    public static int findBitonic(int[] arr){

        int n= arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            int mid=(left+right)/2;

            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }

        return arr[left];
    }
}




