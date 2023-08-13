class Solution {
    public List<String> letterCombinations(String digits) {
        String[] lettersSequence = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
        ArrayList<String> letters = new ArrayList<>();
        for(int i = 0; i < digits.length(); i++){
            letters.add(lettersSequence[Integer.valueOf(digits.substring(i, i + 1))]);
        }
        ArrayList<String> ans = new ArrayList<>();
        combinations(letters, 0, "", ans);
        return digits.length() == 0 ? new ArrayList<>(): ans;
    }
    private static void combinations(ArrayList<String> letters, int start, String combinationStr, ArrayList<String> ans){
        if(start == letters.size()){
            ans.add(combinationStr);
            return;
        }

        for(int j = 0; j < letters.get(start).length(); j++){
            combinations(letters, start + 1, combinationStr + letters.get(start).substring(j, j + 1), ans);
        }
    }
}