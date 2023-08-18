class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n <= k){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combinationSum = new ArrayList<>();
        backtrack(ans, combinationSum, k, n, 1, 0);
        return ans;
    }
    private static void backtrack(List<List<Integer>> ans, List<Integer> combinationSum, int k, int n, int s, int c){
        if(n <= 0 || c == k){   // base condition
            if(n == 0 && c == k){
                ans.add(new ArrayList<>(combinationSum));
                return;
            } else {
                return;
            }
        }


        for(int i = s; i <= 9; i++){
            combinationSum.add(i);
            backtrack(ans, combinationSum, k, n - i, i + 1, c + 1);
            combinationSum.remove(combinationSum.size() - 1);
        }
    }
}