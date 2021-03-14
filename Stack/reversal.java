import java.util.Stack;

public class reversal {

    static Stack<Integer> reverse(Stack<Integer> st) {

        int n = st.size();
        java.util.Stack<Integer> temp = new java.util.Stack<>();

        for (int i = 0; i < n; i++) {
            temp.push(st.pop());
        }

        return temp;
    }

    static void printfunction(Stack<Integer> st) {
        if (st.isEmpty())
            return;

        int x = st.pop();

        System.out.print(x + " ");

        printfunction(st);

        st.push(x);
    }

    public static void main(String[] args) {

        java.util.Stack<Integer> st = new java.util.Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        printfunction(st);

        System.out.println("");

        Stack<Integer> res = reverse(st);

        printfunction(res);

    }
}
