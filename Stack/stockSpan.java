public class stockSpan {
    static int[] stock(int prices[], int n) {
        int res[] = new int[n];
        java.util.Stack<Integer> st = new java.util.Stack<>();

        st.push(0);
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && (prices[st.peek()] <= prices[i])) {
                st.pop();
            }

            res[i] = st.empty() ? i + 1 : i - st.peek();

            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int res[] = stock(price, n);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}