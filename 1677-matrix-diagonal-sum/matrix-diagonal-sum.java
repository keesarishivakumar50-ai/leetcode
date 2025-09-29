class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=n){
                sum+=mat[i][n];
            }
            n--;
        }
        return sum;
    }
}