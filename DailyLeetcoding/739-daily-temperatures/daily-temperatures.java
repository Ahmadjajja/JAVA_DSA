class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] output = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){

            output[i] = 0;

            stack.push(i);

            while(!stack.empty() && i + 1 < temperatures.length && temperatures[i + 1] > temperatures[stack.peek()]){
                int index = stack.pop();

                output[index] = i + 1 - index;
            }

        }

        return output;
    }
}