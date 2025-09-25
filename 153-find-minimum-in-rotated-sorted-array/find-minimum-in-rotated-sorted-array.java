class Solution {
    public int findMin(int[] nums) {
        int x=0,y=nums.length-1;
        while(x<y){
            int mid=x+(y-x)/2;
            if(nums[mid]>nums[y]){
                x=mid+1;
            }
            else{
                y=mid;
            }
        }
        return nums[x];
    }
}