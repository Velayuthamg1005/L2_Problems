package PYQ;

import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a,Integer b){

        int value=a.compareTo(b);

        if(value>0){
            return -1;
        }
        if(value<0){
            return 1;
        }
        return 0;
    }
}

public class KthSmallest {
    public static void main(String[] args) {

        int[] arr={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k=4;

        System.out.println("Kth Smallest: "+findKthSmall(arr,k));

    }

    public static int findKthSmall(int[] arr,int k){

        PriorityQueue<Integer> pq=new PriorityQueue<>(new CustomComparator());

        for(int a:arr) {

            pq.offer(a);

            if (pq.size() > k) {
                pq.poll();
            }

        }

        return pq.peek();

    }
}
