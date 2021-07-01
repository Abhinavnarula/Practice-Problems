// maximum rain water amount store krna hai uska value. 
// approach: use two 

public class RainProblem {

    static int rain(int arr[], int n){
        int L[] = new int[n];
        int R[] = new int[n];
        int sum = 0;
        int temp = 0;

        for(int i = 0;i<n;i++){
            temp = Math.max(temp,arr[i]);
            L[i] = temp;
        }

        temp = 0;

        for (int i = n-1; i >= 0; i--) {
            temp = Math.max(temp, arr[i]);
            R[i] = temp;
        }

        for(int i = 0;i<n;i++){
            sum += Math.min(L[i], R[i]) - arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = rain(arr, arr.length);
        System.out.println(res);
    }
}
