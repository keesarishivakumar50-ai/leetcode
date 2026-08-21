class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int c1 = 1 , c2 = 1;
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        for(int i = 2 ; i < nums.length ; i++){
            if(arr1[c1 - 1] > arr2[c2 - 1]){
                arr1[c1++] = nums[i];
            }
            else{
                arr2[c2++] = nums[i];
            }
        }
        int[] res = new int[nums.length];
        for(int i = 0 ; i < c1 ; i++){
            res[i] = arr1[i];
        }
        for(int i = 0 ; i < c2 ; i++){
            res[c1 + i] = arr2[i];
        }
        return res;
    }
}