class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(nums[i] == nums[j]) c++;
            }
        }
        return c;
    }
}