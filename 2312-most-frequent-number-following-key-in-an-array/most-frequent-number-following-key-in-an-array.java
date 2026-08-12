class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] h = new int[1001];
        int max = 0 , count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == key){
                int target = nums[i + 1];
                h[target]++;
                if(h[target] > max){
                    max = h[target];
                    count = target;
                }
            }
        }
        return count;
    }
}