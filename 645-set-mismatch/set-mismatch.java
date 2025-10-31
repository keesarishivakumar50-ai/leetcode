class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] h=new int[nums.length+1];
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            h[nums[i]]++;
        }
        for(int i=0;i<h.length;i++){
            if(h[i]==2) arr[0]=i;
            else if(h[i]==0) arr[1]=i;
        }
        return arr;
    }
}