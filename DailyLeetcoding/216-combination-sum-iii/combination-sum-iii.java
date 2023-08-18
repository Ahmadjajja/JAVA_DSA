class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combinationSum = new ArrayList<>();
        backtrack(ans, combinationSum, k, n, 1);
        return ans;
    }
    private static void backtrack(List<List<Integer>> ans, List<Integer> combinationSum, int k, int n, int s){
        if(n <= 0 || combinationSum.size() == k){   // base condition
            if(n == 0 && combinationSum.size() == k){
                ans.add(new ArrayList<>(combinationSum));
                return;
            } else {
                return;
            }
        }


        for(int i = s; i <= 9; i++){
            combinationSum.add(i);
            backtrack(ans, combinationSum, k, n - i, i + 1);
            combinationSum.remove(combinationSum.size() - 1);
        }
    }
}