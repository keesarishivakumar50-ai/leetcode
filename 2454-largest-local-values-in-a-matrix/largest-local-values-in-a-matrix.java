class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal=new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[i].length-2;j++){
                maxLocal[i][j]=max(grid,i,j);
            }
        }
        return maxLocal;
    }
    private int max(int[][] arr,int i,int j){
        int res=0;
        for(int x=i;x<i+3;x++){
            for(int y=j;y<j+3;y++){
                res=Math.max(arr[x][y],res);
            }
        }
        return res;
    }
}