class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime = Integer.MAX_VALUE;
        for(int i = 0 ; i < tasks.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < tasks[i].length ; j++){
                sum += tasks[i][j];
            }
            minTime = Math.min(minTime , sum);
        }
        return minTime;
    }
}