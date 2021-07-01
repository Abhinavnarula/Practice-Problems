public class insertionSort {

    static void sort(int arr[], int n) {

        for(int i = 1;i<n;i++){

            int key = arr[i];                               // element is selected
            int j = i-1;                                    // for indexes below this point

            while(j >= 0 && arr[j] > key){                  // if any value exists which is greater than the current value (key)
                arr[j+1] = arr[j];                          // the values are shifted accordingly
                j--;
            }

            arr[j+1] = key;                                 // the key value is inserted in its appropriate place.
        }
    }

    static void printfunction(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr, arr.length);
        printfunction(arr);
    }
}
