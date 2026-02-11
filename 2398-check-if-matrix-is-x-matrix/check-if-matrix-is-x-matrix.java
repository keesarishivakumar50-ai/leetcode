class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid[0].length;
        for(int i = 0 ; i < len ; i++){
            if(grid[i][i] == 0 || grid[i][len - i -1] == 0) return false;
            for(int j = 0 ; j < len ; j++){
                if(i == j || j == len - i - 1) continue;
                if(grid[i][j] != 0 ) return false;
            }
        }
        return true;
    }
}