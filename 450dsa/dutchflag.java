// Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. 
// The functions should put all 0s first, then all 1s and all 2s in last. Use the Dutch flag approach

class flag{
    static void flagApproach(int arr[], int n){
        int l = 0, m = 0,h = n-1;
        while(m <= h){
            switch(arr[m]){
                case(0):{
                    int temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                    l++;
                    m++;
                    break;
                }
                case(1):{
                    m++;
                    break;
                }
                case(2):{
                    int temp = arr[h];
                    arr[h] = arr[m];
                    arr[m] = temp;
                    h--;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        flagApproach(arr, arr.length);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}