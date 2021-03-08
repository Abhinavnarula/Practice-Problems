public class postToPrefix {
    static String postfixToPrefix(String str) {
        java.util.Stack<String> stack = new java.util.Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                stack.push(str.charAt(i) + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = str.charAt(i) + op2 + op1;
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "ABC/-AK/L-*";
        System.out.println(postfixToPrefix(str));
    }
}
