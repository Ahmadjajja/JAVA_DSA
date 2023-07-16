
// Complexity

// * Time complexity: O(n*n*r)
// * Space complexity: O(1)


class Solution {

    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public List < List < Integer >> generate(int n) {

        List < List < Integer >> ans = new ArrayList < > ();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List < Integer > tempLst = new ArrayList < > (); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }
}