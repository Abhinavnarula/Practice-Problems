public class inToPrefix {

    static int prec(char c) {
        switch (c) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String exp) {
        // Your code here
        String res = new String("");
        java.util.Stack<Character> stack = new java.util.Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                res += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    res += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty()
                        && (prec(c) < prec(stack.peek()) || (prec(c) <= prec(stack.peek()) && c == '^')))
                    res += stack.pop();
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            res += stack.pop();
        }
        return res;
    }

    static String reverse(String str) {
        char s[] = str.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        str = String.valueOf(s);
        return str;
    }

    static String infixToPrefix(String str) {

        str = reverse(str);

        char s[] = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '(')
                s[i] = ')';
            else if (s[i] == ')')
                s[i] = '(';
        }
        str = String.valueOf(s);

        str = infixToPostfix(str);

        str = reverse(str);

        return str;
    }

    public static void main(String[] args) {
        String str = "x+y*z/w+u";
        System.out.println(infixToPrefix(str));
    }
}
