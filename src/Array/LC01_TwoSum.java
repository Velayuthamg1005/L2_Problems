package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC01_TwoSum {
    public static void main(String[] args) {

        int[] arr={3,2,3};
        int target=6;

        System.out.println(Arrays.toString(twoSum(arr,target)));

    }

    public static int[] twoSum(int[] arr,int target){

        int n=arr.length;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int result=target-arr[i];

            if(map.containsKey(result)){
                return new int[]{map.get(result),i};
            }

            map.put(arr[i],i);
        }

        return new int[]{-1,-1};
    }
}
