class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        PriorityQueue<Integer>[] heap = new PriorityQueue[m];
        for(int i = 0 ; i < m ; i++){
            heap[i] = new PriorityQueue<>(Collections.reverseOrder());
            for(int j = 0 ; j < n ; j++){
                heap[i].add(grid[i][j]);
            }
        }
        int sum = 0;
        for(int col = 0 ; col < n ; col++){
            int max = 0;
            for(int i = 0 ; i < m ; i++){
                int cur = heap[i].poll();
                max = Math.max(max , cur);
            }
            sum += max;
        }
        return sum;
    }
}