// // Stack solution

// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> stack = new Stack<>();

//         for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) == '*'){
//                 if (!stack.isEmpty()) {
//                     stack.pop();
//                 }
//             } else {
//                 stack.push(s.charAt(i));
//             }
//         }

//         StringBuilder ans = new StringBuilder();

//         while(!stack.empty()){
//             ans.insert(0, stack.pop());
//         }

//         return ans.toString();
//     }
// }


// Simple string builder solution

class Solution {
    public String removeStars(final String s) {
        final StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); ++i) {
            if(sb.length() > 0 && s.charAt(i) == '*') {
                sb.setLength(sb.length() - 1);
            } else if(s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}