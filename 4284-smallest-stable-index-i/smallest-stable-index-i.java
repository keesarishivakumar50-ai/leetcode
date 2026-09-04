class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] PreMin = new int[n];
        PreMin[n - 1] = nums[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){
            PreMin[i] = Math.min(nums[i] , PreMin[i + 1]);
        }
        int Max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            Max = Math.max(Max , nums[i]);
            if(Max - PreMin[i] <= k) return i;
        }
        return -1;
    }
}