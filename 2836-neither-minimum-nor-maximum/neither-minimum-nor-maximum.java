class Solution {
    public int findNonMinOrMax(int[] nums) {
        int x=nums.length;
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        if(x<3) return -1;
        for(int n:nums){
            if(n>m1){
                m2=m1;
                m1=n;
            }
            else if(n>m2){
                m2=n;
            }
        }
        return m2;

    }
}