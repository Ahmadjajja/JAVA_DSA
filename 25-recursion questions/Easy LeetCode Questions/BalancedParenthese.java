public class BalancedParenthese {
    public static void main(String[] args) {
        String exp = "[()]{}{()[()]()}";
        System.out.println(balancedParenthese("", exp));
    }

    private static String balancedParenthese(String stack, String exp) {
        if (exp.length() == 0) {
            return stack.length() == 0 ? "Balanced" : "Not Balanced";
        }
        if (exp.charAt(0) == '[' || exp.charAt(0) == '{' || exp.charAt(0) == '(') {
            return balancedParenthese(stack + exp.substring(0, 1), exp.substring(1));
        } else {
            if (exp.charAt(0) == ']' && stack.charAt(stack.length() - 1) == '[' 
            || exp.charAt(0) == '}' && stack.charAt(stack.length() - 1) == '{'
            || exp.charAt(0) == ')' && stack.charAt(stack.length() - 1) == '(') {
                return balancedParenthese(stack.substring(0, stack.length() - 1), exp.substring(1));
            } else {
                return "Not Balanced";
            }
        }
    }    
}
// Time complexity : O(n2)
// n (because traversal through each character) * n (concatenation and substring operations on strings take O(N) time, where N is the length of the string)
// Space complexity : O(n) 