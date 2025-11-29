package PYQ;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber1 {

    public static void main(String[] args) {

        int[] arr1={2, 30, 2, 15, 20, 30, 15};
        int[] arr2={1, 2, 1, 5, 5};

        System.out.println("Result: "+findUnique(arr2));
        System.out.println("Result: "+findUniqueHashing(arr2));

    }

    // XOR Approach

    public static int findUnique(int[] arr){

        int result=0;

        for(int a:arr){
            result=result^a;
        }

        return result;
    }

    // HashMap

    public static int findUniqueHashing(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }
}
