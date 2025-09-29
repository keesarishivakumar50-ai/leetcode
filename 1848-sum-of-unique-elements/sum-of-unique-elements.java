class Solution {
    public int sumOfUnique(int[] nums) {
        int[] h=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            h[nums[i]]++;
        }
        int sum=0;
        for(int i=1;i<=100;i++){
            if(h[i]==1) sum+=i;
        }
        return sum;
    }
}