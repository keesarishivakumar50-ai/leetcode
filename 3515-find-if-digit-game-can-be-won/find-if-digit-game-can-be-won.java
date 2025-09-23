class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0,d=0,t=0;
        for(int num:nums){
            t+=num;
            if(num<10) s+=num;
            else if(num<100) d+=num;
        }
        int a1=s;
        int b1=t-a1;
        int a2=d;
        int b2=t-a2;
        return a1>b1 || a2>b2;
    }
}