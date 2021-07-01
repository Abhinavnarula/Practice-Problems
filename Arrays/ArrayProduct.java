public class ArrayProduct {

    static int[] product(int arr[], int n) {

        // not correct method as this does not take negative elements into account

        // int res[] = new int[n];
        // int prod = 1;
        // for(int i = 0;i<n;i++){
        // prod *= arr[i];
        // }

        // for(int i = 0;i<n;i++){
        // res[i] = (int)Math.ceil(Math.exp(Math.log(prod) - Math.log(arr[i])));
        // }

        // return res;

        int res[] = new int[n];

        int L[] = new int[n];
        int R[] = new int[n];

        L[0] = arr[0];
        R[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            L[i] = L[i - 1] * arr[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            R[i] = R[i + 1] * arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0)
                res[i] = R[i + 1];
            else if (i == n - 1)
                res[i] = L[i - 1];
            else
                res[i] = L[i - 1] * R[i + 1];
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] result = product(arr, arr.length);
        for (int r : result) {
            System.out.print(r + " ");
        }

    }
}
