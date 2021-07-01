// Given an array Arr[] of size N. For every element in the array, the task is to find the index of the farthest element 
// in the array to the right which is smaller than the current element. If no such number exists then print -1. Note: 0 based indexing. 

public class FarthestNumber {
    static int[] farNumber(int N, int Arr[]) {

        int res[] = new int[N];
        int end = N - 1;
        res[N - 1] = -1;

        for (int i = 0; i < N - 1; i++) {
            int index = end;
            while (index > i && Arr[i] <= Arr[index]) {
                index--;
            }

            res[i] = (index == i) ? -1 : index;
        }

        return res;

    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 5, 2, 4 };
        int res[] = farNumber(arr.length, arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
