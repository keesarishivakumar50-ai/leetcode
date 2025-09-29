class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int x:prices){
            if(x<min){
                min=x;
            }
            else{
                max=Math.max(max,x-min);
            }
        }
        return max;
    }
}