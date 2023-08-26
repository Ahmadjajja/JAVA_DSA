// class Solution {
//     public int getMaximumGold(int[][] grid) {
//         int res = 0;
//         for(int i = 0; i < grid.length; i++){
//             for(int j = 0; j < grid.length; j++){
//                 res = (int) Math.max(res, maxGold(grid, i, j));
//             }
//         }
//         return res;
//     }
//     public int maxGold(int[][] grid, int cr, int cc){
//         if(cr < 0 || cc < 0 || cr >= grid.length || cc >= grid[0].length || grid[cr][cc] == 0 || grid[cr][cc] == -1){
//             return 0;
//         }
//         int temp = grid[cr][cc];
//         grid[cr][cc] = -1;

//         int p1 = temp + maxGold(grid, cr, cc + 1);
//         int p2 = temp + maxGold(grid, cr, cc - 1);
//         int p3 = temp + maxGold(grid, cr + 1, cc);
//         int p4 = temp + maxGold(grid, cr - 1, cc);

//         grid[cr][cc] = temp;

//         return Math.max(p1, Math.max(Math.max(p2, p3), p4));
//     }
// }

class Solution {
    public int getMaximumGold(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                res = Math.max(res,maxGold(grid,i,j));  //we will find out the maximum amount of gold that can be collected from each cell and find out the overall maximum value
            }
        }
        return res;
    }
    
    public int maxGold(int[][] grid,int cr,int cc){
        if(cr < 0 || cc < 0 || cr >= grid.length || cc >= grid[0].length || grid[cr][cc] == 0 ||                                        grid[cr][cc] == -1){
            return 0;
        }
        
		//We can not visit the cell again so we will set the value of this cell to -1 and then we will restore its value after recursive function ends
        int temp = grid[cr][cc];
        grid[cr][cc] = -1;
		
		//We have four choices- left,right,up and down
        int p1 = temp + maxGold(grid,cr,cc + 1);
        int p2 = temp + maxGold(grid,cr,cc - 1);
        int p3 = temp + maxGold(grid,cr - 1,cc);
        int p4 = temp + maxGold(grid,cr + 1,cc);
        grid[cr][cc] = temp;
        
		//return the maximum of all choices
        return Math.max(p1,Math.max(Math.max(p2,p3),p4));
    }
}