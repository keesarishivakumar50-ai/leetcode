class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
                i=i+1;
            }
        }
        int[] arr = new int[nums.length];
        int k = 0;
        for(int n : nums){
            if(n != 0) arr[k++] = n;
        }
        return arr;
    }
}