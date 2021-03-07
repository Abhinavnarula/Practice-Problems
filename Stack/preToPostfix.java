public class preToPostfix {
    static boolean isOperator(char c) {
        switch (c) {
        case '+':
        case '-':
        case '*':
        case '/':
            return true;
        }
        return false;
    }

    static String operation(String a) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + c;
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String c = "*-A/BC-/AKL";
        System.out.println(operation(c));
    }
}
