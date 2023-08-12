class Solution {
    public String decodeString(String s) {
        ArrayList<String> stack = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ']'){
                stack.add(s.substring(i, i + 1));
            } else {
                // extracting subtring
                String subStr = "";
                while(stack.get(stack.size() - 1).charAt(0) != '['){
                    subStr = stack.remove(stack.size() - 1) + subStr;
                }
                stack.remove(stack.size() - 1);
                // extracting number
                String num = "";
                // for extracting number part
                while(stack.size() > 0 && (int) stack.get(stack.size() - 1).charAt(0) >= 48 && stack.get(stack.size() - 1).charAt(0) <= 57){
                    num = stack.remove(stack.size() - 1) + num;
                }
                int n = Integer.valueOf(num);

                for(int j = 0; j < n; j++){
                    stack.add(subStr);
                }
            }
        }
        return String.join("", stack);
    }
}