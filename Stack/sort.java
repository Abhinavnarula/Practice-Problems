import java.util.Stack;

public class sort {
    static Stack<Integer> sortStack(Stack<Integer> st) {

        Stack<Integer> temp = new Stack<>();

        while (!st.empty()) {
            int x = st.pop();

            while (!temp.empty() && (temp.peek() > x)) {
                st.push(temp.pop());
            }

            temp.push(x);
        }

        return temp;

    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();

        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> res = sortStack(input);

        while (!res.isEmpty())
            System.out.print(res.pop() + " ");

    }
}
