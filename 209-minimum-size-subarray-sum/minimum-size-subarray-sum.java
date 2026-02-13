class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            return nums[0]>=target? 1 : 0;
        }
        int i = 0 , j = 0;
        int minlen = nums.length+1, sum = 0;
        for(j = 0 ; j < nums.length ; j++){
            sum = sum + nums[j];
            while(sum >= target){
                minlen = Math.min(minlen , j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        return minlen == nums.length + 1 ? 0 : minlen;
    }
}