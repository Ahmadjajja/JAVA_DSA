import java.util.ArrayList;

public class DigitsInIncreasingOrder{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder st = new StringBuilder("");
        int N = 2;
        if (N == 1) {
           increasingNumbers2(0, N,list, st);
        } else {
            increasingNumbers2(1, N,list, st);
        }
        System.out.println(list);
    }
    
    private static void increasingNumbers2(int start, int N, ArrayList<Integer> list, StringBuilder st){
        if (st.length() >= N) {
            list.add(Integer.valueOf(st.toString()));
            return;
        }

        for (int i = start; i <= 9; i++) {
            st.append(i);
            increasingNumbers2(i + 1, N, list, st);
            st.deleteCharAt(st.length() - 1);
        }
    }
    // private static ArrayList<Integer> increasingNumbers(int N){
    //     // code here
    //     ArrayList<Integer> list = new ArrayList<>();
    //     StringBuilder start = new StringBuilder("");
    //     StringBuilder end = new StringBuilder("");
    //     if(N > 1){
    //         for(int i = 1; i <= N; i++){
    //             start.append(i);
    //             end.append(9 - N + i);
    //         }
    //     } else {
    //         start.append("0");
    //         end.append("9");
    //     }
    //     int s = Integer.valueOf(start.toString());
    //     int e = Integer.valueOf(end.toString());
    //     for(int i = s; i <= e; i++){
    //         list.add(i);
    //     }
    //     return list;
    // }
}


// Time Complexity: O(N)
// Space Complexity: O(N)