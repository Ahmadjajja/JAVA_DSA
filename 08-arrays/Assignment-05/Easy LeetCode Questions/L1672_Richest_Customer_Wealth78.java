// 1672. Richest Customer Wealth

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


public class L1672_Richest_Customer_Wealth78 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {1,2,3}, 
            {1,2,30}, 
            {1,200,3}, 
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int m = accounts.length, n, s, ans;
        int[] sum = new int[accounts.length];
        for(int i = 0; i < m; i++){
            n = accounts[i].length;
            s = 0;
            for(int index = 0; index < n; index++){
                s += accounts[i][index];
            }
            sum[i] = s;
        }
        ans = sum[0];
        for(int i = 1; i < sum.length; i++){
            if(ans < sum[i]){
                ans = sum[i];
            }
        }
        return ans;  
    }
}
