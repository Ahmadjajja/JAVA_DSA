// Row1	        			  0
// 						  /       \
// Row2					0          1
// 					   /   \      /    \
// Row3				  0     1     1      0
// 					 / \    / \   / \   / \
// Row4				0  1   1   0  1  0  0  1

// Index(for Row 4)->  1  2   3   4  5  6  7  8

class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        if(k % 2 == 1){
            return kthGrammar(n - 1, (k + 1) / 2);
        } else {
            int ans = kthGrammar(n - 1, k / 2);
            return ans == 0 ? 1 : 0;
        }
    }
}