public class parenthesis {
    static boolean par(String x) {
        java.util.Stack<Character> st = new java.util.Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (c == '(' || c == '{' || c == '[')
                st.push(c);

            if (st.empty())
                return false;

            char ch;

            switch (c) {
            case ')':
                ch = st.pop();
                if (ch == '{' || ch == '[')
                    return false;
                break;
            case '}':
                ch = st.pop();
                if (ch == '(' || ch == '[')
                    return false;
                break;
            case ']':
                ch = st.pop();
                if (ch == '{' || ch == '(')
                    return false;
                break;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(par(str));
    }
}
