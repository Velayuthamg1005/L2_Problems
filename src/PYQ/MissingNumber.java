package PYQ;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr1={8, 2, 4, 5, 3, 7, 1};
        int[] arr2={1};

        System.out.println("Result: "+findMissingNum(arr1));
        System.out.println("Result: "+findMissingNum(arr2));

        System.out.println("-----------------------------");

        System.out.println("Result: "+findMissingNumFormula(arr1));
        System.out.println("Result: "+findMissingNumFormula(arr2));
    }

    // XOR Approach

    public static int findMissingNum(int[] arr){

        int n=arr.length+1;

        int XOR1=0;

        for(int i=1;i<=n;i++){
            XOR1=XOR1^i;
        }

        int XOR2=0;

        for(int a:arr){
            XOR2=XOR2^a;
        }

        return XOR1^XOR2;
    }

    // Formula Approach

    public static int findMissingNumFormula(int[] arr){

        int n=arr.length+1;

        int sumOfN=n*(n+1)/2;

        int actualSum=0;

        for(int a:arr){
            actualSum=actualSum+a;
        }

        return sumOfN-actualSum;
    }
}
