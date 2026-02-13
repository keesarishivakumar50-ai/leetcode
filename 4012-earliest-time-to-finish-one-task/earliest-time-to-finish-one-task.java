class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int []arr : tasks){
            min = Math.min(arr[0] + arr[1] , min);
        }
        return min;
    }
}