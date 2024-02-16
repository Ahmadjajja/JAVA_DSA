class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();

        for(int j = 0; j < pushed.length; j++){
            stack.push(pushed[j]);
            while(i < popped.length && !stack.empty() && popped[i] == stack.peek()){
                stack.pop();
                i += 1;
            }
        }

        return stack.empty();
    }
}