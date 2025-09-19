class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int x=0,y=0;
       for(int num:nums){
        if(num==1){
            x++;
        }
        else{
            y=Math.max(x,y);
            x=0;
        }
       } 
       y=Math.max(x,y);
       return y;
    }
}