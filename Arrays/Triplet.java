public class Triplet{

    static void tripletSum(int arr[], int n, int target){
        
        int temp_sum = 0, start = 0, end = 0;
        for(int i = 0;i<n-2;i++){
            temp_sum = target - arr[i];
            start = i+1;
            end = n-1;
            boolean flag = false;
            while(start < end){
                if(arr[start] + arr[end] == temp_sum){
                    flag = true;
                    break;
                }
                else if(arr[start] + arr[end] > temp_sum){
                    end--;
                }
                else{
                    start++;
                }
            }

            if(flag == true){
                System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,15};
        int target = 18;

        tripletSum(arr, arr.length, target);
        
        
    }
}
