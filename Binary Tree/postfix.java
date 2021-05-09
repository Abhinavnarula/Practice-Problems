public class postfix extends insertion_bst {

    static int search(int arr[], int key, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == key)
                return i;
        }
        return 0;
    }

    static void postFix(int in[], int pre[], int inStart, int inEnd, int preIndex) {

        if (inStart > inEnd && preIndex >= 6)
            return;

        int inIndex = search(in, pre[preIndex], inStart, inEnd);
        preIndex++;

        // System.out.println("preindex " + preIndex + " instart " + inStart + " inend " + inEnd + " inindex " + inIndex);
        postFix(in, pre, inStart, inIndex - 1, preIndex);
        postFix(in, pre, inIndex + 1, inEnd, preIndex);

        System.out.print(in[inIndex] + " ");
    }

    public static void main(String[] args) {
        int in1[] = { 4, 2, 5, 1, 3, 6 };
        int pre[] = { 1, 2, 4, 5, 3, 6 };
        int n = in1.length;
        System.out.println("Postorder traversal ");
        postFix(in1, pre, 0, n - 1, 0);
    }
}
