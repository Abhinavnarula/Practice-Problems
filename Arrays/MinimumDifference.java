import java.util.Arrays;

public class MinimumDifference {

    static int[] minDiff(int A[], int B[], int n, int m) {

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;

        int min = Integer.MAX_VALUE;

        int res[] = new int[n];

        while (i < n && j < m) {
            if (min > Math.abs(A[i] - B[j])) {
                min = Math.abs(A[i] - B[j]);
                res[0] = A[i];
                res[1] = B[j];
            }
            if (A[i] > B[j])
                j++;
            else
                i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int A[] = { 23, 5, 10, 17, 30 };
        int B[] = { 26, 134, 135, 14, 19 };
        int result[] = minDiff(A, B, A.length, B.length);
        System.out.println(result[0] + " " + result[1]);

    }

}
