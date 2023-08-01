// class Solution {
//     public int lastRemaining(int n) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 1; i <= n; i++){
//             list.add(i);
//         }
//         return (int) helper(list, true);
//     }
//     private static int helper(ArrayList<Integer> list, boolean left){
//         if(list.size() == 1){
//             return list.get(0);
//         }
//         ArrayList<Integer> tempList = new ArrayList<>();
//         if(left){
//             for(int i = 1; i < list.size(); i = i + 2){
//                 tempList.add(list.get(i));
//             }
//         } else {
//             for(int i = list.size() - 2; i >= 0; i = i - 2){
//                 tempList.add(0,list.get(i));
//             }
//         }
//         return helper(tempList, !left);
//     }
// }


// Time limit exceeded

class Solution {
    
    public int lastRemaining(int n) {
        
        int head = 1;
        int remaining = n;
        boolean left = true;
        int step = 1;

        while(remaining>1){

            if(left || remaining % 2 == 1){
                head += step ;
            }
            remaining /= 2;
            step *= 2;
            left = !left;

        }
        return head;
    }
}