import java.util.ArrayList;

public class LexicographicOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String up = "abc";
        lexicoOrder(list, "", up);
        System.out.println(list);
    }

    private static boolean ascendingOrder(String p, int s, int e) {
        if (s == e) {
            return true;
        }
        if (p.charAt(s) > p.charAt(s + 1)) {
            return false;
        }
        return ascendingOrder(p, s + 1, e);
    }
    private static void lexicoOrder(ArrayList<String> list, String p, String up) {
        if (up.equals("")) {
            return;
        }
        for (int i = 0; i < up.length(); i++) {
            String tempP = p + up.substring(i, i + 1);
            if (ascendingOrder(tempP, 0, tempP.length() - 1)) {
                list.add(tempP);
                lexicoOrder(list, tempP, up.substring(0, i) + up.substring(i + 1));
            }
        }
    }
}

// Time complexity : O(n!)
// Space complexity: O(n!)
// O(n) for recursive calls + O(n!) for storing all permutations in arraylist = O(n!) Overall space complexity
 