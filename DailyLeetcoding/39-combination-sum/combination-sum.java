class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        cum(candidates, target, 0, ans, list);
        return ans;
    }
    private static void cum(int[] candidates, int target, int start, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            if(candidates[i] <= target){
                list.add(candidates[i]);
                cum(candidates, target - candidates[i], i, ans, list);
                list.remove(list.size() - 1);
            }
        }
    }
}