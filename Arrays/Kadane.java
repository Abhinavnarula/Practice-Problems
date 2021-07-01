public class Kadane {

    static int sum(int arr[], int n){

        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);

            if(sum < 0)
                sum = 0;
        }

        return maxSum < 0 ? 0 : maxSum ;
    }
    
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,-2,6,-8,3};
        int result = sum(arr,arr.length);
        System.out.println(result);
    }

}
