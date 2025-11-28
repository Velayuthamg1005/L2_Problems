package PYQ;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr1={-7, 1, 5, 2, -4, 3, 0};
        int[] arr2={1,1,1,1};
        System.out.println("Equilibrium Index: "+findEquilibrium(arr2));

    }

    public static int findEquilibrium(int[] arr){

        int n= arr.length;

        int totalSum=0;

        for(int a:arr){
            totalSum=totalSum+a;
        }

        int leftSum=0;

        for(int i=0;i<n;i++){

            totalSum=totalSum-arr[i];

            if(totalSum==leftSum){
                return i;
            }

            leftSum=leftSum+arr[i];
        }

        return -1;
    }

}
