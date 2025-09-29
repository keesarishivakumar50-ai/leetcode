class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int k=n-1;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=k){
                sum+=mat[i][k];
            }
            k--;
        }
        return sum;
    }
}