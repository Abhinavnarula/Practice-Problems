// Given an array of n elements, where every element is at most k away from its target position,
// devise an algorithm that sorts in O(n log k) time. For example, let us consider k is 2, an element at index 7 
// in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array.

import java.util.*;

class customSort {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 2, 6, 3, 12, 56, 8 };
        sort(arr,arr.length,k);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int n, int k){

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0;i<k+1;i++){
            queue.add(arr[i]);
        }

        int index = 0;

        for(int i = k+1;i<n;i++){
            arr[index++] = queue.remove();
            queue.add(arr[i]);
        }

        Iterator<Integer> itr = queue.iterator();

        while(itr.hasNext()){
            arr[index++] = queue.remove();
        }

    }
}
