class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] h=new int[101];
        for(int i=0;i<n;i++){
            h[nums[i]]++;
        }
        for(int i=1;i<100;i++){
            h[i]+=h[i-1];
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
             res[i] = (nums[i] == 0) ? 0 : h[nums[i] - 1];
        }
        return res;
    }
}