class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int x=0,y=0;
       for(int num:nums){
        if(num==1){
            x++;
            y=Math.max(x,y);
        }
        else{
            x=0;
        }
       } 
       return y;
    }
}