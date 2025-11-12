package Array;

import java.util.Arrays;

public class LC283_MoveZeroes {
    public static void main(String[] args) {

        int[] nums={0,1,0,3,12};

        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums){

        int i=0;
        int j=0;

        int n=nums.length;

        while(i<n){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j++]=temp;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
