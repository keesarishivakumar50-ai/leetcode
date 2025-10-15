class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int cur=1;
        int pre=0;
        int max=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)) cur++;
            else{
                pre=cur;
                cur=1;
            }
            max=Math.max(max,Math.max(cur>>1,Math.min(pre,cur)));
            
        }
        return max;
    }
}