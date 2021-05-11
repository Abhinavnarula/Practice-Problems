// Given a sorted array and a number x, find a pair in array whose sum is closest to x. Use two pointer approach.

public class sort {

    static void twopointer(int arr[], int n, int x){
        int left = 0;
        int right = n-1;
        int f_l = 0;
        int f_r = 0;
        int diff = Integer.MAX_VALUE;

        while(left < right){
            if(Math.abs(arr[left] + arr[right] - x) < diff){
                f_l = left;
                f_r = right;
                diff = Math.abs(arr[left] + arr[right] - x);
            }
            if(arr[left] + arr[right] > x)
                right--;
            else
                left++;
        }
        System.out.println(arr[f_l] + " " + arr[f_r]);
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40};
        int x = 54;
        twopointer(arr,arr.length,x);
    }
}
