class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums){
            queue.add(x);
        }
        int res = 0;
        while(k > 0){
            res = queue.poll();
            k--;
        }
        return res;
    }
}