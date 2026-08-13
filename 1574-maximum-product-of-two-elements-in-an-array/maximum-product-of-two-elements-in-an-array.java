class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums){
            queue.add(x);
        }
        int x = queue.poll() - 1;
        int y = queue.poll() - 1;
        return x * y;
    }
}