class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> uniqueCombination = new ArrayList<>();
        uniqueCombinations(candidates, target, 0, uniqueCombination, ans);
        return ans;
    }
    private static void uniqueCombinations(int[] candidates, int target, int start, List<Integer> uniqueCombination, List<List<Integer>> ans){
        if(target <= 0){
            if(target == 0){
                ans.add(new ArrayList<>(uniqueCombination));
                return;
            }
            return;
        }
        int prew = -1;
        for(int i = start; i < candidates.length; i++){
            if(candidates[i] == prew){
                continue;
            }
            uniqueCombination.add(candidates[i]);
            uniqueCombinations(candidates, target - candidates[i], i + 1, uniqueCombination, ans);
            uniqueCombination.remove(uniqueCombination.size() - 1);
            prew = candidates[i];
        }
    }
}