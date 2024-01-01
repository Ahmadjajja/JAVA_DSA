class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            switch(c){
                case '(': 
                    stack.push(')');
                    break;
                case '{': 
                    stack.push('}');
                    break;
                case '[': 
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
                    break;
            }
        }
         return stack.isEmpty();
    }
}