package Array;

import java.util.Arrays;

public class LC2164_SortAscDesc {

    public static void main(String[] args) {

        int[] arr={4,1,2,3};

        int[] result=sortIndices(arr);

        System.out.println("Result "+Arrays.toString(result));
    }

    public static int[] sortIndices(int[] arr){

        int n=arr.length;

        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=i;j<n;j+=2){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            else{
                for(int j=i;j<n;j+=2){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }

        return arr;

    }
}
