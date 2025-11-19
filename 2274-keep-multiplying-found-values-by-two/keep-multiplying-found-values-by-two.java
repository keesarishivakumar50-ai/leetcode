class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res=1;
        while(res!=0){
            res=value(nums,original);
            if(res==original) return original;
            original=res;
        }
        return res;
    }
    private int value(int[] arr,int x){
        for(int num:arr){
            if(num==x) return num*2;
        }
        return x;
    }
}