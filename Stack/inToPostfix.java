public class inToPostfix {
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
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek()))
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

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infixToPostfix(str));
    }
}
