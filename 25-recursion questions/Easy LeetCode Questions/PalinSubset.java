// public class PalinSubset {
//     public static void main(String[] args) {
//         String st = "nitin";
//         palin(st, 1);
//     }

//     private static void palin(String st, int i) {
//         // base condition
//         if (i == st.length()) {
//             if (checkPalin(st, 0, i - 1)) {
//                 System.out.println(st);
//             }
//             return;
//         }
//         for (int j = 0; j <= st.length() - i; j++) {
//             if (checkPalin(st.substring(j, j + i), 0, i - 1)) {
//                 // printing each single character before desired palindrome
//                 for (int k = 0; k < j && i != 1; k++) {
//                     System.out.print(st.charAt(k) + " ");
//                 }
//                 // Rest of the code inside the if block
//                 System.out.print(st.substring(j, j + i) + " ");
//                 // printing each single character after desired palindrome
//                 for (int k = j + i; k < st.length() && i != 1; k++) {
//                     System.out.print(st.charAt(k) + " ");
//                 }
//             }
//         }
//         System.out.println();
//         palin(st, ++i);
//     }

//     private static boolean checkPalin(String st, int s, int e) {
//         // base condition
//         if (s >= e) {
//             return true;
//         }
//         if (st.charAt(s) != st.charAt(e)) {
//             return false;
//         }
//         return checkPalin(st, ++s, --e);
//     }
// }


// =============================================================================================================================
import java.util.ArrayList;
import java.util.List;

public class PalinSubset {
    static int count = 0;
    public static void main(String[] args) {
        // Stores all the partitions.
        List<List<String>> res = new ArrayList<>();
        String s = "nnn";

        // Starting index of string.
        int idx = 0;

        // Current list.
        List<String> curr = new ArrayList<>();
        partition(res, s, idx, curr);
        for (List<String> v : res) {
            for (String it : v) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }

    // Check whether the string is palindrome or not.
    private static boolean checkPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Recursive function which takes starting index idx
    // and generates all substrings starting at idx.
    // If substring generated is palindrome it adds to
    // current list and makes a recursive call for
    // remaining string.
    private static void partition(List<List<String>> res, String s,
                           int idx, List<String> curr) {
        // If we reach the end of string, add the current list to the result.
        if (idx == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // Stores the current substring.
        StringBuilder t = new StringBuilder();
        for (int i = idx; i < s.length(); i++) {
            t.append(s.charAt(i));

            // Check whether the string is palindrome or not.
            if (checkPalindrome(t.toString())) {
                System.out.println(++count);

                // Add the string to current list.
                curr.add(t.toString());

                // Recursive call for the remaining string.
                partition(res, s, i + 1, curr);

                // Remove the string from the current list.
                curr.remove(curr.size() - 1);
            }
        }
    }
}

