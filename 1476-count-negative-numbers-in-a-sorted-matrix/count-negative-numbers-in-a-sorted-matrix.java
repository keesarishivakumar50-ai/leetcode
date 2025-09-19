class Solution {
    public int countNegatives(int[][] grid) {
       int neg=0,m=grid.length;
       for(int i=0;i<m;i++){
        for(int j=grid[i].length-1;j>=0;j--){
            if(grid[i][j]<0) neg++;
            else continue;
        }
       }
        return neg;
    }
}