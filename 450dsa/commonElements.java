import java.util.*;

class result {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> llist = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        int p1 = Integer.MIN_VALUE, p2 = Integer.MIN_VALUE, p3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {

            while (i < n1 && p1 == A[i]) {
                i++;
            }
            while (j < n2 && p2 == B[j]) {
                j++;
            }
            while (k < n3 && p3 == C[k]) {
                k++;
            }

            if (i == n1 || j == n2 || k == n3)
                break;

            if (A[i] == B[j] && B[j] == C[k]) {
                llist.add(A[i]);
                p1 = A[i];
                p2 = B[j];
                p3 = C[k];
                i++;
                j++;
                k++;
            }

            else if (A[i] < B[j]) {
                p1 = A[i];
                i++;
            } else if (B[j] < C[k]) {
                p2 = B[j];
                j++;
            } else {
                p3 = C[k];
                k++;
            }
        }

        return llist;
    }

    public static void main(String[] args) {
        int n1 = 0,n2 = 0,n3 = 0;
        n1 = 6; 
        int A[] = {1, 5, 10, 20, 40, 80};
        n2 = 5;
        int B[] = {6, 7, 20, 80, 100};
        n3 = 8;
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> res = commonElements(A, B, C, n1, n2, n3);

        System.out.println(res);
    }

}
