// An array contains both positive and negative numbers in random order. Rearrange the array elements so that all 
// negative numbers appear before all positive numbers. 

public class posNeg {

    static void printFunction(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void segregate(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // Approach 2

    static void segregate_2(int arr[], int n){
        int l = 0;
        int r = n-1;
        while(l <= r){
            if(arr[l] < 0 && arr[r] < 0){
                l++;
            }
            else if(arr[l] > 0 && arr[r] < 0){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }
            else if(arr[l] > 0 && arr[r] > 0){
                r--;
            }
            else{
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        segregate(arr, arr.length);
        printFunction(arr, arr.length);
    }
}
