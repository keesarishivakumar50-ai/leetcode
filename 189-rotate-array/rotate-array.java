class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        //Rotate the array
        for(int i=0;i<n/2;i++){
            int t=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=t;
        }
        //Rotate first k elements
        for(int i=0;i<k/2;i++){
            int t=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=t;
        }
        //Rotate the remaining elemnets
        for(int i=0;i<(n-k)/2;i++){
            int t=nums[k+i];
            nums[k+i]=nums[n-i-1];
            nums[n-i-1]=t;
        }
    }
}