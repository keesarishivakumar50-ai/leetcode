class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int[] h=new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        h[nums[i]]++;
       } 
       int[] arr=new int[2];
       int k=0;
       for(int i=0;i<h.length;i++){
        if(h[i]==2) arr[k++]=i;
       }
       return arr;
    }
}