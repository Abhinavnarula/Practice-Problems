public class postToInfix {
    static String postfixToInfix(String str) {
        java.util.Stack<String> stack = new java.util.Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                stack.push(str.charAt(i) + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op2 + str.charAt(i) + op1 + ")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "ab*c+";
        System.out.println(postfixToInfix(str));
    }
}
