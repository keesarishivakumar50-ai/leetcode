class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        if(nums.length == 1) return (double)nums[0];
        double sum = 0; 
        double max = Integer.MIN_VALUE;
        while(i <= nums.length - k){
            sum += nums[j];
            j++;
            if(j - i == k){
                max = Math.max(max , sum / k);
                sum -= nums[i++];
            }
        }
        return max;
    }
}