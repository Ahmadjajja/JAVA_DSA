public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str.substring(0, 1), str));
    }

    private static String removeDuplicates(String ans, String str) {
        if (str.length() == 0) {
            return ans;
        }
        if (ans.charAt(ans.length() - 1) != str.charAt(0)) {
            return removeDuplicates(ans + str.substring(0, 1), str.substring(1));
        } else {
            return removeDuplicates(ans , str.substring(1));
        }
    }    
}
// Time complexity : O(n)
// Space complexity : O(n)