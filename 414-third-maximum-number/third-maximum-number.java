class Solution {
    public int thirdMax(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        boolean m1=false,m2=false,m3=false;
        for(int n:nums){
            if((m1 && n==max1) || (m2 && n==max2) || (m3 && n==max3)){
                continue;
            }
            if(!m1 || n>max1){
                max3=max2;m3=m2;
                max2=max1;m2=m1;
                max1=n;m1=true;
            }
            else if(!m2 || n>max2){
                max3=max2;m3=m2;
                max2=n;m2=true;
            }
            else if(!m3 || n>max3){
                max3=n;m3=true;
            }
        }
        return m3? max3:max1;
    }
}