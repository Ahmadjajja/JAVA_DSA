import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        // only add open parenthesis if open < n
        // only add a closing parenthesis if closed < open
        // valid IIF open == closed == n

        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int n, int openN, int closedN, StringBuilder sb, List<String> res) {
        if (openN == n && closedN == n) {
            res.add(sb.toString());
            return;
        }

        if (openN < n) {
            sb.append("(");
            backtrack(n, openN + 1, closedN, sb, res);
            sb.setLength(sb.length() - 1);
        }

        if (closedN < openN) {
            sb.append(")");
            backtrack(n, openN, closedN + 1, sb, res);
            sb.setLength(sb.length() - 1);
        }
    }
}
