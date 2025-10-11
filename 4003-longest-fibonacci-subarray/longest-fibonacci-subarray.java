class Solution {
    public int longestSubarray(int[] nums) {
     int n=nums.length;
     if(n<=2) return n;
     int max=2;
     int x=2;
     for(int i=2;i<n;i++){
        if(nums[i]==nums[i-1]+nums[i-2]){
            x++;
        }
        else{
            x=2;
        }
        max=Math.max(x,max);
     }   
     return max;
    }
}