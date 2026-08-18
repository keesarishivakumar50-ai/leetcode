class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        for(int x : nums) count[x]++;
        if(k == 1){
            for(int i = 50 ; i >= 0 ; i--){
                if(count[i] == 1) return i;
            }
            return -1;
        }
        if(k == n){
            int max = -1;
            for(int x : nums) max = Math.max(max , x);
            return max;
        }
        int res = -1;
        if(count[nums[0]] == 1) res = Math.max(res , nums[0]);
        if(count[nums[n - 1]] == 1) res = Math.max(res , nums[n - 1]);
        return res;
    }
}