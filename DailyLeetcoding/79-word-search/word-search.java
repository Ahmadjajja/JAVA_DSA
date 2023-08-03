class Solution {
    public boolean exist(char[][] board, String word) {
        boolean ans = false;
        boolean[][] check = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    ans = search(board, check, 0, i, j, word, ans);
                }
                if(ans == true){
                    return true;
                }
            }
        }
        return ans;
    }
    private static boolean search(char[][] board, boolean[][] check, int wordIndex, int row, int col, String word, boolean ans){
        if(wordIndex == word.length() - 1){
            return true;
        }
        // keep track
        check[row][col] = true;
        wordIndex++;

        // up check
        if(!ans && row > 0 && !check[row - 1][col] && board[row - 1][col] == word.charAt(wordIndex)){
            ans = search(board, check, wordIndex, row - 1, col, word, ans);
        }
        // bottom check
        if(!ans && row < board.length - 1 && !check[row + 1][col] && board[row + 1][col] == word.charAt(wordIndex)){
            ans = search(board, check, wordIndex, row + 1, col, word, ans);
        }
        // left check
        if(!ans && col > 0 && !check[row][col - 1] && board[row][col - 1] == word.charAt(wordIndex)){
            ans = search(board, check, wordIndex, row, col - 1, word, ans);
        }
        // right check
        if(!ans && col < board[0].length - 1 && !check[row][col + 1] && board[row][col + 1] == word.charAt(wordIndex)){
            ans = search(board, check, wordIndex, row, col + 1, word, ans);
        }

        // back track
        check[row][col] = false;
        wordIndex--;

        if(ans == true) {
            return true;
        } else {
            return false;
        }
    }
}